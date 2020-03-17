    import java.util.ArrayList;
    import java.util.Arrays;

    public class Anagrams {
//        private ArrayList<String> getWords(String strWordOne, String strWordTwo){
//            ArrayList<String> wordsArray= new ArrayList<>();
//            wordsArray.add(strWordOne);
//            wordsArray.add(strWordTwo);
//            return wordsArray;
//        }
        public  Boolean returnAnagram (String words){
            String[] arrayWords = words.split("\\W+");
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arrayWords));
            boolean bool = false;
            ArrayList<String> q = new ArrayList<>();
            ArrayList<String> f = new ArrayList<>();


                for (int i=0;i<arrayList.size();i++){
                    if(arrayList.get(i).length()==arrayList.get(i+=1).length()){
                        f.add(arrayList.get(i));
                    }
                    for (String str: f){
                        if (str.length()!=arrayList.get(i).length()){
                            String ans = arrayList.;
                        }
                    }
                }






//            ArrayList<String> arrayList = getWords(strWordOne,strWordTwo);
//            String wordOne = "";
//            String wordTwo = "";
//            wordOne += arrayList.get(0);
//            wordTwo += arrayList.get(1);
//            int len1 = wordOne.length();
//            int len2 = wordTwo.length();
//            boolean bool = false;
//            ArrayList<String> results = new ArrayList<>();
//            if (len1 == len2){
//                for(int i =0;i<wordOne.length();i++){
//                    if (wordOne.charAt(i)==wordTwo.charAt(i)){results.add("true");}
//                }
//            }
            if (results.size()>0){ bool= true; }
            return bool;
        }
    }