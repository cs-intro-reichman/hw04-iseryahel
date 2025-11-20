public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String lowSentence ;
        String lowKeyWord ;
        boolean found ;

        for (int i = 0 ; i < sentences.length ; i++) // going over the sentences
            {
                found = false;
                lowSentence = MyString.lowerCase(sentences[i]); // change it to lower so we can check. with the function we built

                for (int j= 0 ; j < keywords.length ; j++) // going over the words in the sentce 
                {
                    lowKeyWord = MyString.lowerCase(keywords[j]); // change it to lower so we can check. with the function we built
                    if (MyString.contains(lowSentence, lowKeyWord)) { // using the function we built and checking if the word is in the sentence
                        found = true ;
                        break ;
                    }
                }
                if (found) 
                {
                    System.out.println(sentences[i]); // if thw word is inside we print thw sentece
                }
           
             }
        }
    }


