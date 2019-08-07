
       

class NL{
//    
//    public static void main(String[] args) {
//   String  x = "4";
//   NL test = new NL();
//   int r= 24;
//   String FragF = "000";
//   String FragO= "011";
//   FragO = String.format("%13s", Integer.toBinaryString((r*2)/8)).replace(' ', '0');
//        System.out.println(FragO);
//   FragO= FragF+FragO;
//        System.out.println("f "+FragO);
//        int e = Integer.parseInt(FragO, 2);
//        System.out.println("ee" + e);
//   String hexstr = String.format("%04x", e);
//        System.out.println("FragF "  +FragF);
//        System.out.println("e "+hexstr);
//   String y = String.format("%13s", Integer.toBinaryString(Integer.parseInt(x))).replace(' ', '0');
//   y = String.format("%13s", Integer.toBinaryString((r*2)/8)).replace(' ', '0');
//    //encoded += String.format("%4s", Integer.toBinaryString(Integer.parseInt(Version))).replace(' ', '0');
//  
//   
//        System.out.println("y =  "+y);
//        String[] ar = test.encode("4", "00", "05", "06", "E5457890", "EFAC0B31", "", "1234567891987654006789065400000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000009876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b3112345051767891923456000000000000000000000000000000000000000000000000000000000000000000055555555555555555555555555555578919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192355555555555555555555555555555555555555555555555555555555555555555555555555555555555545678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176766666666666666666666666666666666666666666666666666666689192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b31123450517678919234567877777777777777777777777777777777777777777777777777777777777777777777919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b3112345051767891923456789198788888888888888888888888888888888888888888888888888888888888888888888888888888888888888888886540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b3112345051799999999999999999999999999999999999999999999999999999999999999999999996789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b311234505176789192345678919876540067890efaca0b31123450517678919876543210321400");
//        System.out.println("");          
//   System.out.println("x  "+ar[0] +"     x l "+ar[0].length());
//    System.out.println("y  "+ar[1] +"     x l "+ar[1].length());  
//        String [] pop =test.decode("450000660001400005061cdeE567890efaca021400");
//        for (int i = 0 ; i < 14 ; i ++){
//            System.out.println("i = "+i+"    "+pop[i]);
//        }
//           }
//    

       
    public NL(){
        
    }
    
    public int MTU = 1500;
    
    public String[] encode(String Version , String ServiceType, 
           String ttl, String Protocol,String sIP,
            String dIP, String Option, String Data ){
        CRC16 crc16 = new CRC16();
        Datagram dg = new Datagram();
        int size = 1;
        String encoded= "";
        String FragFlag="00";
        
        String FragOffst="00";
        
        String totalLength= "0000";
        
        String Ident="0001";
        ttl = String.format("%02x", Integer.parseInt(ttl));
        String HeadChecksum="0000";
        int Hlen = 0;
        
        encoded = Version + Hlen + ServiceType + totalLength + Ident + FragFlag + FragOffst + ttl+ Protocol+ HeadChecksum + sIP + dIP  + Option+ Data;
        totalLength = String.format("%04x", encoded.length());
        String xtemp = Version + Hlen + ServiceType + totalLength + Ident + FragFlag + FragOffst + ttl+ Protocol+ HeadChecksum + sIP + dIP  + Option;
        ///System.out.println("xtemp  "+xtemp.length());
        Hlen = (xtemp.length())/8;
        //System.out.println("hlen 1  "+Hlen);
        size = encoded.length()/(MTU*2);
        if (size ==0 || size %(MTU*2) !=0){
            size++;
        }
        //System.out.println("siz   "+size);
        String[] encodedA = new String[size];
        String FragRes = "";
        String FragDont = "";
        String FragMore = "";
        String FragF = "";
        String FragO = "";
        int idx1 = 0;
        if (size>=1){
            //System.out.println("sa2");
            for (int i =0; i <=size-1;++i){
                encodedA[i]= Version + Hlen + ServiceType + totalLength;
                encodedA[i]+= String.format("%04x", i+1);
                    
                      //  System.out.println("12321jas");
                        FragRes="0";
                            if (encoded.length()<(MTU*2)){
                                FragDont="1";
                            }
                            else{
                                FragDont="0";
                            }
                           // System.out.println("i  =  "+i +"  size-1  "+size);
                            if (i ==(size-1)){
                                FragMore="0";
                            }
                            else{
                                FragMore="1";
                            }
                        FragF = FragRes+FragDont+FragMore;
                        FragO = String.format("%13s", Integer.toBinaryString((MTU*i)/8)).replace(' ', '0');
                        FragO= FragF+FragO;
                        int e = Integer.parseInt(FragO, 2);
                        String hexstr = String.format("%04x", e);
                        encodedA[i]+= hexstr;
                        encodedA[i]+= String.format("%02x", Integer.parseInt(ttl));
                        encodedA[i]+= Protocol+HeadChecksum+sIP+dIP;
                        if (Option.equals("") == false){
                            encodedA[i]+=Option;
                        }
                        
                        String DataF = "";
                        
                        int hlen = Hlen*8;
//                        System.out.println("mtuuu "+((MTU*2)-(hlen)));
//                        System.out.println("idxb "+idx1);
//                        System.out.println("i    "+i);
//                        System.out.println("size "+size);
                        if( i < size-1){
                            DataF = Data.substring(idx1, ((MTU*2)-(hlen)));
                        }else if (i == (size-1)){
                            DataF = Data.substring(idx1, Data.length());
                        }
                        idx1 = ((MTU*2)-(hlen))*(i+1);
//                        System.out.println("idxa "+idx1);
                        encodedA[i]+= DataF;
                        String d,f,g, t;
                        d=encodedA[i].substring(0, 4);
                        f=encodedA[i].substring(8, encodedA[i].length());
                        g= String.format("%04x", encodedA[i].length()/2);
                        t = d+g+f;
                        encodedA[i]=t;
                        
                        String HCheck = "";
                        HCheck = crc16.CRC(encodedA[i].substring(0, Hlen*8));
                        String a,b,c;
                        a = encodedA[i].substring(0,20);
                        b = encodedA[i].substring(24, encodedA[i].length());
                        
                        c = a + HCheck+ b;    
                        encodedA[i]=c;

                    
            }
        }
        return encodedA;
        
    
    }
    
    
    public String[] decode(String D){
            
            CRC16 crc16 = new CRC16();
        
            String Version = "0";
            String Hlen = "0";
            String ServiceType = "00";
            String totalLength = "0000";
            String Ident = "0000";
            String Fragment = "0000";
            String ttl = "00";
            String Protocol = "00";
            String HeadChecksumC = "0000";
            String HeadChecksumR = "0000";
            String sIP = "00000000";
            String dIP = "00000000";
            String Option = "";
            String Data = "";
            String a,b,c;
        
            Version = D.substring(0,1);
            Hlen = D.substring(1, 2);
            ServiceType = D.substring(2, 4);
            totalLength = D.substring(4, 8);
            Ident = D.substring(8, 12);
            Fragment = D.substring(12, 16);
            ttl = D.substring(16, 18);
            Protocol = D.substring(18, 20);
            HeadChecksumR = D.substring(20, 24);
            sIP = D.substring(24, 32);
            dIP = D.substring(32, 40);
            if (Integer.parseInt(Hlen)>5){
                Option = D.substring(40, (40+((Integer.parseInt(Hlen)-5))*4));
                Data = D.substring((40+((Integer.parseInt(Hlen)-5))*4), D.length());
            }else{
                Data = D.substring(40, D.length());
            }
            a = D.substring(0, 20);
//            System.out.println("a  "+a);
            b = D.substring(24, 40);
//            System.out.println("b  "+b);
            c =  a+ "0000"+b;
//            System.out.println("c  "+c);
            HeadChecksumC = crc16.CRC(c);
//            System.out.println("H "+HeadChecksumC);
            String [] decoded = new String[14];
            for (int i = 0 ; i <=14 ; i ++){
                switch (i){
                    case 1 : decoded[0]=Version;break;
                    case 2 : decoded[1]=Hlen;break;
                    case 3 : decoded[2]=ServiceType;break;    
                    case 4 : decoded[3]=totalLength;break;
                    case 5 : decoded[4]=Ident;break;    
                    case 6 : decoded[5]=Fragment;break;    
                    case 7 : decoded[6]=ttl;break;    
                    case 8 : decoded[7]=Protocol;break;    
                    case 9 : decoded[8]=HeadChecksumR;break;    
                    case 10 : decoded[9]=sIP;break;    
                    case 11 : decoded[10]=dIP;break;    
                    case 12 : decoded[11]=Option;break;    
                    case 13 : decoded[12]=Data;break;    
                    case 14 : decoded[13]=HeadChecksumC;break;    
                }
            }return decoded;
    }
    
    
}