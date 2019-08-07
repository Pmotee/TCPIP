
import java.util.Scanner;

class Driver{
    public static void main(String[] args) {
        DLL go = new DLL();
        
        Scanner kybd = new Scanner(System.in);
        String DA= "";
        String SA ="";
        String type ="";
        String data ="";
        int x=0;
        System.out.print("Enter '1' for encode and '2' for decode: " );
        x= kybd.nextInt();
        if (x == 1){
            while ((DA.length()==12 || (DA.length()==17 && (DA.contains(":") || DA.contains(" "))))!=true){
        System.out.print("Enter your Destination Address: ");    
        DA=kybd.nextLine().toLowerCase();
        }
        while ((SA.length()==12 || (SA.length()==17 && (SA.contains(":") || SA.contains(" "))))!=true){
        System.out.print("Enter your Source Address: ");    
        SA=kybd.nextLine().toLowerCase();
        }
        while (type.equals("0800") !=true){
        System.out.print("Enter your Ethernet Type: ");    
        type=kybd.nextLine().toLowerCase().replaceAll(" ", "");
            if (type.equals("0806")){
                System.out.print("ARP currently not supported.");
            }else if (type.equals("86dd")){
                 System.out.print("IPv6 currently not supported.");
            }else{
             }
        }
        
        System.out.println("Enter your payload/data: ");
        data = kybd.nextLine();
        data =data.replaceAll(" ", "");
        while (data.length()>1500 ==true){
            System.out.println("Data size too large for this packet.");
            data = kybd.nextLine();
        }
        String[] d1 = new String[1];
        d1[0]=data;
        go.setPayload(d1);
        go.MACHeader(DA, SA, type);
        System.out.println("Encoded Packet  "+go.encode());
        }
        else if (x==2){
            go.decode("321abc321efc32165498732108004500004412340100ff11270ec0a8000ac0a8000c1f571f5700304ce645002805c84000002d06906040ffb4fcc0a801040050f16821909581c7dc363b5010832cce1d000016bbc314");
        }
        
    }
}