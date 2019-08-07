
public class PCRC32 { 
   public String calcCRC32(String D){
       java.util.zip.CRC32 x = new java.util.zip.CRC32();
       HexStringtoHexVal test = new HexStringtoHexVal();
       byte[] bytes = test.HexByte(D);
       x.update(bytes);
       String crcInverse ="00000000";
       String enc = String.format("%08x", x.getValue());
       crcInverse = enc;
       String temp = "";
        for (int i=enc.length()/2-1; i >=0;i--){
            temp += enc.substring(i*2, i*2+2);
        }
        
       crcInverse=temp;
       return crcInverse;
   }


}