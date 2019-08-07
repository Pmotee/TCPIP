
import java.util.ArrayList;

class DLL{
    
    private String SourceAddress;
    private String DestinationAddress;
    private String Type;
    private String[] Payload;
    private String PayloadS;
    public String checksumRecived;
    public String checksumCalculated;
    
    public DLL(){
    
}
    
    public String MACHeader(String DA, String SA, String type){
        String MAC = "";
        this.DestinationAddress = DA;
        this.SourceAddress = SA;
        this.Type = type;
        MAC= DestinationAddress+SourceAddress+Type;
        return MAC;
    }
     public String MACHeader(){
        String MAC = "";
        MAC= DestinationAddress+SourceAddress+Type;
        return MAC;
        
    }
    public void setDestinationAdd(String DA){
            DA =DA.replaceAll(":", "");
        this.DestinationAddress = DA.toLowerCase();
    }
    
    public String getDestinationAdd(){
        return this.DestinationAddress.toLowerCase();
    }
    
    public void setSourceAdd(String SA){
            SA =SA.replaceAll(":", "");
        this.SourceAddress = SA.toLowerCase();
    }
    
    public String getSourceAdd(){
        return this.SourceAddress.toLowerCase();
    }
    
    public void setType(String T){
        T.replaceAll(" ", "");
        this.Type = T.toLowerCase();
    }
    
    public String getType (){
        return this.Type;
    } 
    
    public void setPayload(String[] P){
        this.Payload = P;
        for (int i=0; i<Payload.length;i++){
        this.Payload[i].toLowerCase();
        this.Payload[i].replaceAll(" ", "");
        }   
    }
    public void setPayload(String P){
        Frame f1 = new Frame(P.length()/2); 
        f1.Padder(P);
        this.PayloadS = f1.toStringData();
        
    }
    
    
    public String[] getPayload(){
        return this.Payload;
    }  
    
    public String getPayloadS(){
        return this.PayloadS;
    }
    
    public void setchecksumCalculated(String D){
        this.checksumCalculated = D;
    }
    public void setchecksumRecieved(String D){
        this.checksumRecived = D;
    }
    
    public ArrayList<String> encode(){
    ArrayList<String> encode = new ArrayList();
    PCRC32 checksum = new PCRC32();
    for (int i=0;i< Payload.length;i++){
        Frame EthernetFrame = new Frame(Payload[i].length()/2);
        String FrameOut = "";
        
        EthernetFrame.setDAddress(this.DestinationAddress);
        EthernetFrame.setSAddress(this.SourceAddress);
        EthernetFrame.setType(this.Type);
        EthernetFrame.Padder(this.Payload[i]);
        EthernetFrame.setCRC(checksum.calcCRC32(EthernetFrame.Checksum()));
        FrameOut = EthernetFrame.FrameOut(1);   //arg 1 for space after ever 2 hex string or 2 for no space
        encode.add(FrameOut);
    }
    
    return encode;
}
    public void decode(String D){
        PCRC32 checksum = new PCRC32();
        System.out.println("D len "+D.length());
        this.DestinationAddress = D.substring(0, 12);
        System.out.println("Destination MAC Address: "+this.DestinationAddress);
        this.SourceAddress = D.substring(12, 24);
        System.out.println("Source MAC Address: "+this.SourceAddress);
        this.Type = D.substring(24, 28);
        System.out.println("Ethernet Type: "+this.Type);
        this.Payload = new String[D.length()/2];
        if (D.length() <3000){
            System.out.println("payload "+this.Payload.length);
            this.Payload[0]=D.substring(28,D.length()-8 );
            this.checksumRecived = D.substring(D.length()-8, D.length());
            System.out.println("Payload: "+this.Payload[0]);
            System.out.println("Checksum Recieved: "+this.checksumRecived);
            this.checksumCalculated =checksum.calcCRC32(MACHeader()+this.Payload[0]);
            boolean crc = this.checksumCalculated.equals(this.checksumRecived);
            if (crc ==true){
                System.out.println("CRC calculated: "+ this.checksumCalculated);
                System.out.println("Packet not corrupted.");
            }else{
                System.out.println("CRC calculated: "+ this.checksumCalculated);
                System.out.println("Packet corrupted!");
            }
            
        }else{
       //     for 
            
        }
    }
}