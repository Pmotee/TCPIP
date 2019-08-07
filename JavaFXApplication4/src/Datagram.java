class Datagram{
    
    public Datagram(){
        
    }
    
    private String Version;
    private String Hlen;
    private String ServiceType;
    private String totalLength;
    private String Ident;
    private String FragFlag;
    private String FragOffst;
    private String ttl;
    private String Protocol;
    private String HeadChecksum;
    private String sIP;
    private String dIP;
    private String Option;
    private String Data;
    
    public void setVer (String V){
        
        Version = V;
        
    }
     
    public String getVer(){
        return Version;
    }
    
    public void setHlen (String H){
        
        Hlen = H;
        
    }
    
    public String getHlen (){
        return Hlen;
    }
    
    public void setST (String ST){
        
        ServiceType = ST;
        
    }
    
    public String getST(){
        return ServiceType;
    }
    public void setTotLength (String totl){
        
        totalLength = totl;
        
    }
    
    public String getTotLength(){
        return totalLength;
    }
    
    public void setIdent (String I){
        
        Ident = I;
        
    }
    public String getIdent(){
        return Ident;
    }
    
    public void setFF (String FF){
        
        FragFlag = FF;
        
    }
    
    public String getFF(){
        return FragFlag;
    }
    
    public void setFO (String FO){
        
        FragOffst = FO;
        
    }
    
    public String getFO(){
        return FragOffst;
    }
    
    public void setTtl (String t){
        
        ttl = t;
        
    }
    
    public String getTtl(){
        return ttl;
    }
    
    public void setProt (String P){
        
        Protocol = P;
        
    }
    
    public String getProt(){
        return Protocol;
    }
    
    public void setHeadC (String HC){
        
        HeadChecksum = HC;
        
    }
    
    public String getHeadC(){
        return HeadChecksum;
    }
    
    public void setSIP (String s){
        
        sIP = s;
        
    }
    
    public String getSIP(){
        return sIP;
    }
    
    public void setDIP (String d){
        
        dIP = d;
        
    }
    
    public String getDIP(){
        return dIP;
    }
    
    public void setOpt (String O){
        
        Option = O;
        
    }
    
    public String getOpt(){
        return Option;
    }
    
    public void setData (String D){
        
        Data = D;
        
    }
    
    public String getData(){
        return Data;
    }
    
}