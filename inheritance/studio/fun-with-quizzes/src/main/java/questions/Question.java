package questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public abstract class Question {

    private final String question;
    private final HashMap<Integer, Choice> choiceMap = new HashMap<>();
    private int maxResponses = 1;

    // For questions with choices
    public Question(String question, Choice[] choiceArray) {
        this.question = question;

    }

    public String getQuestion() {
        return question;
    }

    public HashMap<Integer, Choice> getChoiceMap() {
        return choiceMap;
    }

    public int getMaxResponses() {
        return maxResponses;
    }

    public void setMaxResponses(int maxResponses) {
        this.maxResponses = maxResponses;
    }

    @Override
    public abstract String toString();

    void createRandomizedChoiceMap(Choice[] choiceArray) {
        ArrayList<Choice> choiceList = new ArrayList<>();
        Collections.addAll(choiceList, choiceArray);
        Collections.shuffle(choiceList);
        for (int i = 0; i < choiceList.size(); i++) {
            choiceMap.put(i+1, choiceList.get(i));
        }
    }

    String getFormattedChoices() {
        StringBuilder formattedChoices = new StringBuilder();
        // set lineSeparator to variable to reuse it a bunch
        String newLine = System.lineSeparator();
        for (int choiceNum : choiceMap.keySet()) {
            String choice = "\t" + choiceNum + " - " + choiceMap.get(choiceNum).getContent() + newLine;
            formattedChoices.append(choice);
        }
        return formattedChoices.toString();
    }

    public boolean isInvalid(String resp) {
        try {
            int respInt = Integer.parseInt(resp);
            return respInt < 0 || respInt > choiceMap.size();
        } catch (NumberFormatException e) {
            return true;
        }
    }


}
