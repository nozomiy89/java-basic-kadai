package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	public String getMyChoice() {
		
		Scanner scanner = new Scanner(System.in);
		String input = "r";
		
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			input = scanner.next();
			
			if(input.equals("r") || input.equals("s") || input.equals("p")) {
				break;
			} else {
				System.out.println("じゃんけんの手が正しくありません。再度入力してください。");
			}
		}
		return input;
	}
	
	public String getRandom() {
		String[] jyankenArray = {"r", "s", "p"};
		
		String random = jyankenArray[(int)(Math.floor(Math.random()*3))];
		return random;
	}
	
	public void playGame(String myChoice, String random) {
		
		HashMap<String, String> output = new HashMap<String, String>();
		
		output.put("r", "グー");
		output.put("s", "チョキ");
		output.put("p", "パー");
		
		System.out.println("自分の手は" + output.get(myChoice) + ",対戦相手の手は" + output.get(random));
		
		if((myChoice.equals("r") && random.equals("s")) || (myChoice.equals("s") && random.equals("p")) || (myChoice.equals("p") && random.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else if(myChoice.equals(random)) {
			System.out.println("あいこです");
		} else {
			System.out.println("自分の負けです");
		}
	}

}
