import java.util.HashMap;

public class AutoComplete {
    private TrieNode root;
    public AutoComplete() {
        root = new TrieNode();
    }
    public AutoComplete(String[] wordBank)   {
        for (String word:wordBank){
            this.insert(word);
        }
    }

    public String[] search(String input){//prints out the possible words from the word bank
        HashMap<Character, TrieNode> children = root.getChildren();

        TrieNode temporaryNode = null;
        TrieNode chosenNode = null;
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(children.containsKey(c)) {
                temporaryNode = children.get(c);
                children = temporaryNode.getChildren();
            }
        }

        return null;//placeholder
    }
    public void insert(String word) {
        HashMap<Character, TrieNode> children = root.getChildren();
        for (int i = 0; i < word.length(); i++) {//traverses through each letter in the word
            char c = word.charAt(i);
            TrieNode temporaryNode;
            if (children.containsKey(c)) {//traverses to the next letter
                temporaryNode = children.get(c);
            } else {//adds the new character to the trienode
                temporaryNode = new TrieNode(c);
                children.put(c, temporaryNode);
            }
            children = temporaryNode.getChildren();//the next trienode in place

            if (i == word.length() - 1) {//marks the end of a word
                temporaryNode.setEndOfWord(true);
            }
        }
    }





}

