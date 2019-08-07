

class Frame{

    private String[] DAddress;
    private String[] SAddress;
    private String[] Type;
    private String[] Data;
    private String[] CRC;
    public Frame(int size){
        this.DAddress= new String[6];
        this.SAddress= new String[6];
        this.Type = new String[2];
        if (size < 46){
            this.Data = new String[46];
        }else{
        this.Data = new String[size]; 
        }
        this.CRC = new String[4];
        
    }
   
   
   public void setDAddress (String D){
       for (int i=0; i <this.DAddress.length;i++){
            this.DAddress[i]= D.substring(i*2, i*2+2);
         
       }
   }
   public String[] getDAddress(){String s ="";
       for(int i=0; i< this.DAddress.length; i++){
            s += this.DAddress[i];
       }
       
       return this.DAddress;
   }
    public void setSAddress (String D){
       for (int i=0; i <this.SAddress.length;i++){
            this.SAddress[i]= D.substring(i*2, i*2+2);
           
       }
   }
    public String[] getSAddress(){String s ="";
       for(int i=0; i< this.SAddress.length; i++){
            s += this.SAddress[i];
       }
       
       return this.SAddress;
   }
   public void setType(String D){
       this.Type[0]= D.substring(0, 2);
       this.Type[1]= D.substring(2, 4);
   }
   
   public void Padder (String D){   //call this class for setData. Adds 0s in case of smaller than 46 bytes
       String modified = "";
       if (D.length() <92){
           modified = String.format("%092x", 0);
           String temp = "";
           temp = D;
           modified = modified.substring(0, 92-D.length());
           temp += modified;
           modified = temp;
       }     
       else if (D.length()%2 !=0 && D.length() >92){
           String temp ="0";
           temp = temp + D;
           modified = temp;
           
       }else{
           modified = D;
       }
       this.setData(modified);
   }
   private void setData (String D){
       for (int i=0; i <this.Data.length;i++){
            this.Data[i]= D.substring(i*2, i*2+2);
           
       }
   }
   public String[] getData(){String s ="";
       for(int i=0; i< this.Data.length; i++){
            s += this.Data[i];
       }
       
       return this.Data;
   }
     public void setCRC (String D){
       for (int i=0; i <this.CRC.length;i++){
            this.CRC[i]= D.substring(i*2, i*2+2);
           
       }
   }
      public String[] getCRC(){String s ="";
       for(int i=0; i< this.CRC.length; i++){
            s += this.CRC[i];
       }
       
       return this.CRC;
   }
   public String FrameOut(int outtype){                 //makes the ethernet frame. recieves int 1 or 2 for either output with space after ever 2 hex character or without
       String out ="";
       for (int i=0;i< this.DAddress.length;i++){
           out+= this.DAddress[i];
   }
       for (int i=0;i< this.SAddress.length;i++){
           out+= this.SAddress[i];
   }
       for (int i=0;i< this.Type.length;i++){
           out+= this.Type[i];
   }
       for (int i=0;i< this.Data.length;i++){
           out+= this.Data[i];
   }
       for (int i=0;i< this.CRC.length;i++){
           out+= this.CRC[i];
   }
       out =out.toLowerCase();
       if (outtype == 1){
           return out;
       }else if (outtype == 2){
           return FrameOutWithSpace(out);
       }else{
           System.out.println("Wrong Output type.");
       }
       return null;
   }
   public String FrameOutWithSpace(String D){
       String temp = "";
       for (int i =0; i< D.length();i++){
           temp+= D.charAt(i);
           if (i % 2 !=0 && i != 0){
               temp+= " ";
           }
       } return temp;
   }
   public String Checksum(){                 //makes the ethernet frame
  String out ="";
       for (int i=0;i< this.DAddress.length;i++){
           out+= this.DAddress[i];
   }
       for (int i=0;i< this.SAddress.length;i++){
           out+= this.SAddress[i];
   }
       for (int i=0;i< this.Type.length;i++){
           out+= this.Type[i];
   }
       for (int i=0;i< this.Data.length;i++){
           out+= this.Data[i];
   }
       out =out.toLowerCase();
       return out;
   }
   
public String toStringData(){
       String D = "";
       for (int i=0;i<Data.length;i++){
           D+= Data[i];
       }
       return D;
   }
} 

