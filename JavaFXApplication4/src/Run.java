
import javafx.animation.TranslateTransition;
import javafx.application.Application; 
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
     
public class Run extends Application { 
    
    @Override 
   public void start(Stage primaryStage) {      
    
         Group group = new Group ();    
         Animation animation = new Animation ();
         DLL dll = new DLL();
         
         
         
         Image diagram = new Image("1.PNG");
         ImageView mv = new ImageView(diagram);
         mv.setTranslateX(100);
         mv.setTranslateY(10);
         
         Circle figure = animation.getPicture(7);
         figure.setTranslateX(183.5);
         figure.setTranslateY(124);
         figure.setFill(Color.BLUE);
         
         TextField inputDA = new TextField();
         inputDA.setTranslateX(150);
         inputDA.setTranslateY(500);
         
         TextField inputSA = new TextField();
         inputSA.setTranslateX(150);
         inputSA.setTranslateY(550);
         
         TextField inputType = new TextField();
         inputType.setTranslateX(150);
         inputType.setTranslateY(600);
         
         TextField inputData = new TextField();
         inputData.setTranslateX(150);
         inputData.setTranslateY(650);
         
         Label name1 = new Label("Destination MAC");
         name1.setTranslateX(20);
         name1.setTranslateY(500);
         Label name2 = new Label("Source MAC");
         name2.setTranslateX(20);
         name2.setTranslateY(550);
         
         Label name3 = new Label("Type");
         name3.setTranslateX(20);
         name3.setTranslateY(600);
         
         Label name4 = new Label("Data");
         name4.setTranslateX(20);
         name4.setTranslateY(650);
         
         Label name5 = new Label("String at current State:");
         name5.setTranslateX(400);
         name5.setTranslateY(475);
         
         TextArea Output = new TextArea();
         Output.setEditable(false);
         Output.setWrapText(true);
         Output.setTranslateX(400);
         Output.setTranslateY(500);
         Output.setMinWidth(270);
         Output.setMinHeight(190);
         
         group.getChildren().addAll(mv) ;
         
         Button done= new Button ("Calculate String");
         done.setTranslateY(410);
         done.setTranslateX(755);
         done.autosize();
         done.setMinHeight(50);
         done.setMinWidth(50);
         
         done.setOnAction(e -> {
                int set=0;
                int error=0;
                String DA= "";
                String SA ="";
                String type ="";
                String data ="";
                
                String send1= "";
                String send2= "";
                String send3= "";
                String send4= "";
                
                  
        DA=inputDA.getText().toLowerCase().replaceAll(" ", "");
             
        if ((DA.length()==12 )==true){
            send1=DA;
            set++;
        }else{
                    Output.appendText("Wrong Value for Destination Address.\n");
                    
                }
        ; 
        SA=inputSA.getText().toLowerCase().replaceAll(" ", "");
                 if ((SA.length()==12 )==true){   
                     send2=SA;
                     set++;
        }else{
                     Output.appendText("Wrong Value for Source Address.\n");
                     error=1;
                 }   
        type=inputType.getText().toLowerCase().replaceAll(" ", "");
        if (type.equals("0800") ==true){
            send3=type;
            set++;
        }
            else if (type.equals("0806")){
                Output.appendText("ARP currently not supported.\n");
                error=1;
            }else if (type.equals("86dd")){
                 Output.appendText("IPv6 currently not supported.\n");
                 error=1;
            }else{
                Output.appendText("Wrong Value for Ethernet Type.\n");
                error=1;
   }
        
        data = inputData.getText().toLowerCase();
        data =data.replaceAll(" ", "");
        
        if (data.length()<3000 && data.length() !=0){
            send4=data;
            set++;
        }else if(data.length()==0){
            send4=data;
            set++;
            Output.appendText("Data field empty.\n");
        }
        else{
            error=1; 
            Output.appendText("Data size too large for this packet.\n");
        }
        if (set==4){
            
            inputDA.setEditable(false);
            inputSA.setEditable(false);
            inputType.setEditable(false);
            inputData.setEditable(false);
            
            String[] d1 = new String[1];
                String packet ="";
                d1[0]=send4;
                dll.setPayload(d1);
                dll.MACHeader(send1, send2, send3);
                System.out.println("Encoded Packet  "+dll.encode());
                //Output.setText(dll.encode().get(0));
                switch (animation.count){
                    case 1 :   String temp =""; 
                               Output.setText(data);
                               System.out.println("payload"); 
                                break;
                    case 2 :     dll.setPayload(data);
                                 Output.setText(dll.MACHeader(send1, send2, send3)+dll.getPayloadS());
                                 break;
                    case 3 : 
                             System.out.println("payload  "+packet);
                             packet= dll.encode().get(0);
                             Output.setText(packet);
                             break;
                    case 4 : packet= dll.encode().get(0);
                             Output.setText(packet);
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
                    case 6 : Output.setText(dll.getDestinationAdd()+dll.getSourceAdd()+dll.getType()+dll.getPayload()[0]);
                        break;
                    case 7 : Output.setText(dll.getPayload()[0]);
                        break;
                }
        }
        
         });
         
         Button start = new Button("Next");
         start.setTranslateY (410);
         start.setTranslateX (385);
          
         start.setOnAction(e -> 
                    {       
         animation.Movement(figure);                    
                    }); 
          
          
          
         Button stop = new Button("Stop");
         stop.setTranslateY (410);
         stop.setTranslateX (435);
          
         stop.setOnAction(e -> 
                    {       
         animation.Pause();                     
                    }); 
        
        
          
        group.getChildren().addAll( figure, start, stop, done,inputDA, inputSA, inputType,inputData,name1,name2,name3,name4,name5,Output );
                     
        Scene scene = new Scene( group, 900, 700);  
        primaryStage.setScene(scene);
        primaryStage.show();
        
   } 
    
   public static void main(String args[]){ 
      launch(args); 
   } 
}
 
 
class Animation {
     
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
            case 1 : System.out.println("count = "+count);
        
            transition.setDuration(Duration.seconds(1));      
            transition.setNode(myPictureMoving);        
            transition.setByY(78);
            transition.setByX(0);
            transition.play();
            transition.setOnFinished(evt ->
            
        {    
            count++;
            transition.stop();
        });
                break;
            case 2 : System.out.println("count = "+count);
        
            transition.setDuration(Duration.seconds(1));      
            transition.setNode(myPictureMoving);        
            transition.setByY(75);
            transition.setByX(0);
            transition.play();;     
            transition.setOnFinished(evt ->
            
        {           
            count++;
        });
                break;
            case 3 : System.out.println("count = "+count);
        
            transition.setDuration(Duration.seconds(1.5));      
            transition.setNode(myPictureMoving); 
            transition.setByX(275);
            transition.setByY(-1);
            transition.play(); 
            transition.setOnFinished(evt ->
            
        {           
            count++;
        });
                break;
            case 4 : System.out.println("count = "+count);
        
            transition.setDuration(Duration.seconds(1.5));      
            transition.setNode(myPictureMoving);        
            transition.setByX(249);
            transition.setByY(-1);
            transition.play();  
            transition.setOnFinished(evt ->
            
        {           
            count++;
        });
                break;
            case 5 : System.out.println("count = "+count);
        
            transition.setDuration(Duration.seconds(1));      
            transition.setNode(myPictureMoving);        
            transition.setByY(-75);
            transition.setByX(0);
            transition.play();   
            transition.setOnFinished(evt ->
            
        {           
            count++;
        });
                break;
        case 6 : System.out.println("count = "+count);
        
            transition.setDuration(Duration.seconds(1));      
            transition.setNode(myPictureMoving);        
            transition.setByY(-75);
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