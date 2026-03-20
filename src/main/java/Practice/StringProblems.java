package Practice;

public class StringProblems {


    public String toggleStringCase(String str){
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(c>='a' && c<='z'){
                sb.append((char)(c-32));
            }
            else if(c>='A' && c<='Z'){
                sb.append((char)(c+32));
            }
            else{
                sb.append(c);
            }
        }

        return sb.toString();
    }
    public String toggleStringCaseByJava8(String str){
        StringBuilder sb = new StringBuilder();
        str.chars().forEach(c->{
            if(c>='a' && c<='z'){
                sb.append((char)(c-32));
            }
            else if(c>='A' && c<='Z'){
                sb.append((char)(c+32));
            }
            else{
                sb.append((char)c);
            }
        });
        return sb.toString();
    }


    public String camelCasing(String s){
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String i: str){
             if(!i.isEmpty())
                 sb.append(i.substring(0, 1).toUpperCase()).append(i.substring(1).toLowerCase()).append(" ");
            else sb.append(" ");

        }
        return sb.toString();
    }

    private String magic(String s){
        return null;
    }


    public String camelCasingBruteForce(String s){
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String i: str){
            int counter=0;
            for(char c : i.toCharArray()){
                if(counter==0){
                    if(c>='a' && c <= 'z'){
                        char ch = (char)(c -32);
                        sb.append(ch);
                    }
                    else sb.append(c);

                    counter++;
                }else {
                    sb.append(c);
                }
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

}
