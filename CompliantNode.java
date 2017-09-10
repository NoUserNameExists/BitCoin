import java.util.ArrayList;
import java.util.Set;
import java.util.*;

/* CompliantNode refers to a node that follows the rules (not malicious)*/
public class CompliantNode implements Node {

    int numRounds;
    double p_graph;
    double p_malicious;
    double p_txDistribution;
    Transaction rectx;
    Set<Transaction> pendtrnx;
    Set<Transaction> rettrnx;
    boolean[] followes;
    //rettrnx = new HashSet<Transaction>();
    public CompliantNode(double p_graph, double p_malicious, double p_txDistribution, int numRounds) {
        // IMPLEMENT THIS
        //System.out.println("p_graph" + p_graph);
        //System.out.println("p_malicious" + p_malicious);
        //System.out.println("p_txdistribution" + p_txDistribution);
        //System.out.println("numRounds" + numRounds);
        p_graph = this.p_graph;
        p_malicious = this.p_malicious;
        p_txDistribution = this.p_txDistribution;
        numRounds = this.numRounds;
        rettrnx = new HashSet<Transaction>();
    }

    public void setFollowees(boolean[] followees) {
        // IMPLEMENT THIS
        followes = followees;
        //System.out.println("followes size: " + followes.length);
    }

    public void setPendingTransaction(Set<Transaction> pendingTransactions) {
        // IMPLEMENT THIS
        pendtrnx = pendingTransactions;
        //rettrnx = new HashSet<Transaction>();
        //System.out.println("Pending Transaction: " + pendtrnx);
    }

    public Set<Transaction> sendToFollowers() {
        // IMPLEMENT THIS
        //System.out.println("rettrnxSize: " + rettrnx.size());
        return pendtrnx;
    }

    public void receiveFromFollowees(Set<Candidate> candidates) {
        // IMPLEMENT THIS

        int i=0;
        //rettrnx = new HashSet<Transaction>();
        //System.out.println("Candidate: " + candidates.size());

        for (Candidate c : candidates) {

            //System.out.println("Size rettrnx" + rettrnx.size());
            //System.out.print("CandidateTransaction:" + c.tx + "  ");
            //System.out.println("CandidateSender: " + c.sender);
            //if (followes[c.sender])
            {
                pendtrnx.add(new Transaction (c.tx.id));
            }

            //System.out.println("rettrnx: " + c.tx);

            /*
            for (Transaction a: pendtrnx
                    ) {
                    System.out.println("Transaction: " + a);
                    if (a.equals(c.tx)){
                        //System.out.print("CandidateTransaction:" + c.tx + "  ");
                        //System.out.println("Transaction: " + a);
                        rettrnx.add(c.tx);
                        System.out.println("Size rettrnx" + rettrnx.size());
                    }

                }
             */
            }


            //System.out.println("Candidate transaction: " + c.tx);
            //System.out.println("Candidate transaction: " + c.sender);
    }
}
