
import javafx.animation.TranslateTransition;
import javafx.application.Application; 
import javafx.event.ActionEvent;
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage; 
import javafx.util.Duration;  
     
public class Run2 extends Application { 
    
    @Override 
   public void start(Stage primaryStage) {      
    
         Group group = new Group ();    
         Animation2 animation = new Animation2 ();
         DLL dll = new DLL();
         
         NL nl = new NL();
         
         Image diagram = new Image("2.PNG");
         ImageView mv = new ImageView(diagram);
         mv.setTranslateX(100);
         mv.setTranslateY(10);
         
         Circle figure = animation.getPicture(5);
         figure.setTranslateX(174);
         figure.setTranslateY(145);
         figure.setFill(Color.BLUE);
         
         TextField inputDA = new TextField();
         inputDA.setTranslateX(230);
         inputDA.setTranslateY(400);
         
         TextField inputSA = new TextField();
         inputSA.setTranslateX(230);
         inputSA.setTranslateY(430);
         
         TextField inputType = new TextField();
         inputType.setTranslateX(230);
         inputType.setTranslateY(460);
         
         
         TextField inputV = new TextField();
         inputV.setTranslateX(230);
         inputV.setTranslateY(575);
         
         
         TextField inputSType = new TextField();
         inputSType.setTranslateX(230);
         inputSType.setTranslateY(605);
         
         TextField inputTTL = new TextField();
         inputTTL.setTranslateX(230);
         inputTTL.setTranslateY(635);
         
         TextField inputProt = new TextField();
         inputProt.setTranslateX(230);
         inputProt.setTranslateY(665);
         
         TextField inputSIP = new TextField();
         inputSIP.setTranslateX(230);
         inputSIP.setTranslateY(695);
         
         TextField inputDIP = new TextField();
         inputDIP.setTranslateX(230);
         inputDIP.setTranslateY(725);
         
         TextField inputOption = new TextField();
         inputOption.setTranslateX(230);
         inputOption.setTranslateY(755);
         
         TextField inputData = new TextField();
         inputData.setTranslateX(230);
         inputData.setTranslateY(785);
         
         Label name1 = new Label("Destination MAC(xx:xx:xx:xx:xx:xx)");
         name1.setTranslateX(20);
         name1.setTranslateY(400);
         Label name2 = new Label("Source MAC(xx:xx:xx:xx:xx:xx)");
         name2.setTranslateX(20);
         name2.setTranslateY(430);
         
         Label name3 = new Label("Type(Hex xxxx)");
         name3.setTranslateX(20);
         name3.setTranslateY(460);
         
         Label name5 = new Label("String at current State:");
         name5.setTranslateX(565);
         name5.setTranslateY(595);
         
         Label name6 = new Label("Ethernet Frame");
         name6.setTranslateX(100);
         name6.setTranslateY(365);
         
         Label name7 = new Label("Datagram");
         name7.setTranslateX(100);
         name7.setTranslateY(540);
         
         Label name8 = new Label("Version(Hex x)");
         name8.setTranslateX(20);
         name8.setTranslateY(575);
         
         
         Label name10 = new Label("ServiceType(Hex xx)");
         name10.setTranslateX(20);
         name10.setTranslateY(605);
         
         Label name11 = new Label("TimetoLive(Decimal 0<x<255)");
         name11.setTranslateX(20);
         name11.setTranslateY(635);
         
         Label name12 = new Label("Protocol(Hex xx)");
         name12.setTranslateX(20);
         name12.setTranslateY(665);
         
         Label name13 = new Label("SourceIP(xxx.xxx.xxx.xxx)");
         name13.setTranslateX(20);
         name13.setTranslateY(695);
         
         Label name14 = new Label("DestIP(xxx.xxx.xxx.xxx)");
         name14.setTranslateX(20);
         name14.setTranslateY(725);
         
         Label name15 = new Label("Option(Hex)(Empty = No option)");
         name15.setTranslateX(20);
         name15.setTranslateY(755);
         
         Label name16 = new Label("Data from TL(Hex xxxxxxxx....)");
         name16.setTranslateX(20);
         name16.setTranslateY(785);
         
         TextArea Output = new TextArea();
         Output.setEditable(false);
         Output.setWrapText(true);
         Output.setTranslateX(400);
         Output.setTranslateY(620);
         Output.setMinWidth(270);
         Output.setMinHeight(190);
         
         group.getChildren().addAll(mv) ;
         
         Button done= new Button ("Calculate String");
         done.setTranslateY(430);
         done.setTranslateX(755);
         done.autosize();
         done.setMinHeight(50);
         done.setMinWidth(50);
         
         done.setOnAction((ActionEvent e) -> {
                int set=0;
                String DA= "";
                String SA ="";
                String type ="";
                String data ="";
                
                String send1= "";
                String send2= "";
                String send3= "";
                String send4= "";
                
                  
        DA=inputDA.getText().toLowerCase().replace(":", "");
             
        if ((DA.length()==12 )==true){
            send1=DA;
            set++;
        }else{
                    Output.appendText("Wrong Value for Destination Address.\n");
                    
                }
        ; 
        SA=inputSA.getText().toLowerCase().replace(":", "");
                 if ((SA.length()==12 )==true){   
                     send2=SA;
                     set++;
        }else{
                     Output.appendText("Wrong Value for Source Address.\n");
                     
                 }   
        type=inputType.getText().toLowerCase().replaceAll(" ", "");
        if (type.equals("0800") ==true){
            send3=type;
            set++;
        }
            else if (type.equals("0806")){
                Output.appendText("ARP currently not supported.\n");
               
            }else if (type.equals("86dd")){
                 Output.appendText("IPv6 currently not supported.\n");
                 
            }else{
                Output.appendText("Wrong Value for Ethernet Type.\n");
                
   }
        
        data = inputData.getText().toLowerCase();
        data =data.replaceAll(" ", "");
        
        if (data.length()%2==0){
//            System.out.println("here dummy");
            set++;
        }else if(data.length()==0){
            set++;
            Output.appendText("Data field empty.\n");
        }
        else{
            
            Output.appendText("Data needs to be a multiple of 2.\n");
        }
        
            String V, ST, TTL,Prot, SIP, DIP, Op, Data;
            int tTL=0;
            V= inputV.getText().toLowerCase();
            if (V.equals("4")==false){
                Output.appendText("Invalid Version.\n");
            }else{
                set++;
            }
            
            ST = inputSType.getText().toLowerCase();
//             System.out.println("ST "+ST);
            if (ST.length() ==2 &&(Integer.parseInt(ST) >= 0 && Integer.parseInt(ST) <= 255)){
                set++;
            }else{
                Output.appendText("Invalid Service Type.\n");
            }
            if (inputTTL.getText().length()==0){
                inputTTL.setText("0");
            }
            tTL = Integer.parseInt(inputTTL.getText());
            TTL = inputTTL.getText();
//             System.out.println("ttl  "+tTL);
            if (tTL >= 0 && tTL <= 255){
                set++;
            }else{
                 Output.appendText("Invalid Time to Live.\n");
            }
            Prot = inputProt.getText().toLowerCase();
            if (Prot.length()==2 && (Prot.equals("06") || Prot.equals("17"))){
                set++;
            }else{
                Output.appendText("Invalid Protocol.\n");
            }
             
            SIP = IP2Hex(inputSIP.getText());
//             System.out.println("SIP  "+SIP);
            if (SIP.length()==8){
                set++;
          }else{
                Output.appendText("Invalid SourceIP.\n");
          }
            
            DIP = IP2Hex(inputDIP.getText());;
            if (DIP.length()==8){
                set++;
           }else{
                Output.appendText("Invalid DestIP.\n");
          }
            Op = inputOption.getText().toLowerCase();
            if(Op.length()==0 || (Op.length()>0 && Op.length() <4)){
                set++;
            }else{
                Output.appendText("Invalid Option.\n");
            }
            
        if (set==11){
            
            inputDA.setEditable(false);
            inputSA.setEditable(false);
            inputType.setEditable(false);
            inputData.setEditable(false);
            
//            System.out.println("did we make it?");
            
            
            String[] d1 = new String[1];
                String packet ="";
                d1= nl.encode(V, ST, TTL, Prot, SIP, DIP, Op, data);
                dll.setPayload(d1);
                dll.MACHeader(send1, send2, send3);
//                System.out.println("Encoded Packet  "+dll.encode());
                //Output.setText(dll.encode().get(0));
                String[] encodeNL = nl.encode(V, ST, TTL, Prot, SIP, DIP, Op, data);
                switch (animation.count){
                    case 1 :   String temp =""; 
                               Output.setText(data.toUpperCase());
                                break;
                    case 2 :     Output.setText("");
                                
                                 for (int i = 0; i< encodeNL.length;i++){
                                     Output.appendText("Segment: "+(i+1)+ "  :  "+encodeNL[i].toUpperCase()+"\n");
                                 }
                                 break;
                    case 3 :    Output.setText("");
                                for (int i = 0; i< encodeNL.length;i++){
                                     packet= dll.encode().get(i);
                                     Output.appendText("Packet Num:  "+(i+1)+ "  :  "+packet+"\n");
                                 }
                             
                             break;
                    case 4 : packet= dll.encode().get(0);
                             Output.setText(packet.toUpperCase());
                             break;
                    case 5 : 
                        packet= dll.encode().get(0);
                        dll.decode(packet);
                        Output.setText(dll.getDestinationAdd()+dll.getSourceAdd()+dll.getType()+dll.getPayload()[0]);
                        Output.appendText("\nCRC Recieved: "+dll.checksumRecived+"\n");
                        Output.appendText("CRC Calculated: "+dll.checksumCalculated+"\n");
                        if (dll.checksumCalculated.equals(dll.checksumRecived)){
                            Output.appendText("Packet is not corrupted.\n");
                        }else{
                            Output.appendText("Packet it corrupted.\n");
                        }
                        break;
                    case 6 :  encodeNL = nl.encode(V, ST, TTL, Prot, SIP, DIP, Op, data);
                                 Output.setText(encodeNL[0].toUpperCase());
                        break;
                    case 7 : Output.setText(data.toUpperCase() );
                        break;
                }
        }
        
         });
         
         Button start = new Button("Next");
         start.setTranslateY (454);
         start.setTranslateX (685);
          
         start.setOnAction(e -> 
                    {       
         animation.Movement(figure);                    
                    }); 
          
        
          
        group.getChildren().addAll( figure, start, done,inputDA, inputSA, inputType,inputData,
                inputV, inputSType, inputTTL, inputProt, inputSIP, inputDIP,inputOption, 
                name1,name2,name3,name5,name6,name7,name8,name10, name11,name12,name13,name14,name15,name16 ,Output );
                     
        Scene scene = new Scene( group, 900, 830);  
        primaryStage.setScene(scene);
        primaryStage.show();
        
   } 
    public String IP2Hex(String reqIpAddr) {
		String hex = "";
		String[] part = reqIpAddr.split("[\\.,]");
		if (part.length < 4) {
			return "00000000";
		}
		for (int i = 0; i < 4; i++) {
			int decimal = Integer.parseInt(part[i]);
			if (decimal < 16) // Append a 0 to maintian 2 digits for every
								// number
			{
				hex += "0" + String.format("%01X", decimal);
			} else {
				hex += String.format("%01X", decimal);
			}
		}
		return hex;
	}
    
   public static void main(String args[]){ 
      launch(args); 
   } 
}
 
 
class Animation2 {
     
    public int count =1; 
    TranslateTransition transition = new TranslateTransition(); 
     
         
    public Circle getPicture (int optimalSize) 
    {   
    Circle myPicture = new Circle(optimalSize);          
    return myPicture;
    }
     
     
     
    public void Movement (Circle myPictureMoving) 
    { 
        switch (count){
            case 1 : 
//                System.out.println("count = "+count);
        
            transition.setDuration(Duration.seconds(1));      
            transition.setNode(myPictureMoving);        
            transition.setByY(66);
            transition.setByX(0);
            transition.play();
            transition.setOnFinished(evt ->
            
        {    
            count++;
            transition.stop();
        });
                break;
            case 2 :
//                System.out.println("count = "+count);
        
            transition.setDuration(Duration.seconds(1));      
            transition.setNode(myPictureMoving);        
            transition.setByY(93);
            transition.setByX(-.5);
            transition.play();;     
            transition.setOnFinished(evt ->
            
        {           
            count++;
        });
                break;
            case 3 : 
//                System.out.println("count = "+count);
        
            transition.setDuration(Duration.seconds(1.5));      
            transition.setNode(myPictureMoving); 
            transition.setByX(273);
            transition.setByY(0);
            transition.play(); 
            transition.setOnFinished(evt ->
            
        {           
            count++;
        });
                break;
            case 4 :
//                System.out.println("count = "+count);
        
            transition.setDuration(Duration.seconds(1.5));      
            transition.setNode(myPictureMoving);        
            transition.setByX(272.5);
            transition.setByY(4);
            transition.play();  
            transition.setOnFinished(evt ->
            
        {           
            count++;
        });
                break;
            case 5 : 
//                System.out.println("count = "+count);
        
            transition.setDuration(Duration.seconds(1));      
            transition.setNode(myPictureMoving);        
            transition.setByY(-98);
            transition.setByX(0);
            transition.play();   
            transition.setOnFinished(evt ->
            
        {           
            count++;
        });
                break;
        case 6 : 
//            System.out.println("count = "+count);
        
            transition.setDuration(Duration.seconds(1));      
            transition.setNode(myPictureMoving);        
            transition.setByY(-66);
            transition.setByX(0);
            transition.play();   
            transition.setOnFinished(evt ->
            
        {           
            count++;
        });
        }
        
        
        }
     
    public void Pause (){
        transition.pause();
    }

   
}