package collection;

import java.util.ArrayList;

public class C7_retainAll_Method {
    public static void main(String[] args) {

        ArrayList<String> candidateList=new ArrayList<>();
        candidateList.add("Rudra");
        candidateList.add("Sahil");
        candidateList.add("Jhon");
        candidateList.add("Sachin");
        candidateList.add("Sunil");

        ArrayList<String> shortlistedCandidate=new ArrayList<>();
        shortlistedCandidate.add("Rudra");
        shortlistedCandidate.add("Sunil");

        System.out.println("Applied Candidates -->"+candidateList);

        candidateList.retainAll(shortlistedCandidate);
        System.out.println("Shortlisted Candidates -->"+candidateList);


/* Here We take an example of interview process total candidates are added in the candidate list
*  after the interview shortlist candidates we make special list and used RETAINALL method
* this method used to keep the specified values and remove rest of the values from the List the  */
    }
}
