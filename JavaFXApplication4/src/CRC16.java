class CRC16{
    public CRC16(){
        
    }
    public String CRC(String D){
        String curr = D.substring(0,4);
        String next = "";
        
        for (int i=0; i < (D.length()/4)-1;i++){
            next = D.substring(((i*4)+4), ((i*4)+8));
            int x = Integer.parseInt(curr, 16);
            int y = Integer.parseInt(next, 16);
            y = x+y;
            curr= Integer.toHexString(y);
            if (curr.length()>4){
                char c = curr.charAt(0);
                curr =curr.substring(1, 5);
                int d = Integer.parseInt(curr, 16);
                int e = c - '0';
                e = d+e;
                curr = Integer.toHexString(e);
            }
        }
        System.out.println("curr  "+curr);
        String temp="";
        for (int i = 0 ; i < curr.length(); i++){
            char c;
            c = curr.charAt(i);
            switch (c){
                     case '0': c = 'f';
                    break;
                     case '1': c = 'e';
                    break;
                    case '2': c = 'd';
                    break;
                     case '3': c = 'c';
                    break;
                     case '4': c = 'b';
                    break;
                     case '5': c = 'a';
                    break;
                     case '6': c = '9';
                    break;
                     case '7': c = '8';
                    break;
                     case '8': c = 'F';
                    break;
                     case '9': c = '6';
                    break;
                     case 'a': c = '5';
                    break;
                     case 'b': c = '4';
                    break;
                     case 'c': c = '3';
                    break;
                     case 'd': c = '2';
                    break;
                     case 'e': c = '1';
                    break;
                     case 'f': c = '0';
                    break;
            }
            temp += c;
            System.out.println("temp  "+temp);
            System.out.println("D  "+D);
        }
        System.out.println("temp  "+D);
        System.out.println("yoyo");
        return temp;
    }

}
