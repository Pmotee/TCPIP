class HexStringtoHexVal{
    public HexStringtoHexVal(){
        
    }
    public byte [] HexByte(String x){
        
        String[] Bytes = new String [x.length()/2];
        byte[] output = new byte[Bytes.length];
        for (int i=0; i <Bytes.length;i++){
            Bytes[i]= x.substring(i*2, i*2+2);
           
       }char indx1 =0, indx2 =0;
        for (int i=0; i< Bytes.length;i++){
            char a = '\uffff';
            byte b = (byte)a;
            indx1= Bytes[i].charAt(0);
            indx2= Bytes[i].charAt(1);
            int total =0;
            switch (indx1){
                case '0': total += 0*16;
                    break;
                case '1': total += 1*16;
                    break;
                case '2': total += 2*16;
                    break;
                case '3': total += 3*16;
                    break;    
                case '4': total += 4*16;
                    break;
                case '5': total += 5*16;
                    break;
                case '6': total += 6*16;
                    break;
                case '7': total += 7*16;
                    break;
                case '8': total += 8*16;
                    break;
                case '9': total += 9*16;
                    break;
                case 'a': total += 10*16;
                    break;
                case 'b': total += 11*16;
                    break;
                case 'c': total += 12*16;
                    break;
                case 'd': total += 13*16;
                    break;  
                case 'e': total += 14*16;
                    break;
                case 'f': total += 15*16;
                    break;    
            }
         switch (indx2){
                case '0': total += 0;
                    break;
                case '1': total += 1;
                    break;
                case '2': total += 2;
                    break;
                case '3': total += 3;
                    break;    
                case '4': total += 4;
                    break;
                case '5': total += 5;
                    break;
                case '6': total += 6;
                    break;
                case '7': total += 7;
                    break;
                case '8': total += 8;
                    break;
                case '9': total += 9;
                    break;
                case 'a': total += 10;
                    break;
                case 'b': total += 11;
                    break;
                case 'c': total += 12;
                    break;
                case 'd': total += 13;
                    break;  
                case 'e': total += 14;
                    break;
                case 'f': total += 15;
                    break;    
        }
            output[i]=(byte)total;
            }
        
         return output;
    };
}