import javax.xml.soap.Text;
import java.util.ArrayList;

public class TextGenerator {

    private String outputString;
    private int stringLength;
    private ArrayList<String> corpus;

    public TextGenerator(){
        // Constructor, currently does nothing.
    }

    public void buildCorpus(String filePath){
        // read a file from the given file path and construct an array list of strings to be used as the corpus of the Markov chain
    }

    public void GenerateText(){
        // use a markov chain to generate text from the corpus
    }
}

/*
Need to work out how to use version control here
I've added the remote, need to see how i can login to git
then i can get on with making commits and pushing etc

A Markov Chain is an example of a Markov Process, which is a process that satisfies the Markov Property.
The Markov Property specifies a memoryless process, each transition is dependant only on the current state
and not on previous transitions; "the conditional probability distribution of future states of the process depends only on
the present state".
This property makes recursive methods very easy.
 */