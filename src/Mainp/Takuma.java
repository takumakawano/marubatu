package Mainp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Takuma {
	 public static void main(String[]args) {
		 //ジャンケンで先行を決める
		 //自分と相手の数字を入れる
		 
		  Scanner sc = new Scanner(System.in);
		  
		  Random random = new Random();
		 
		  Integer player ;
		  Integer player2 ;
		  
		  Integer fast;
		  Integer second ;
		  
		  while(true) {
		 System.out.println("ジャンケンの選択を入力してください(グー:0, パー:1, チョキ:2");
		 
		 System.out.println("あなたの出す番です入力してください");
		 
		  player = sc.nextInt();
		  System.out.println("相手の入力の番です");
		  
		  player2 = sc.nextInt();
		  
		  if((player == 0 && player2 == 2)||(player == 1 && player2 == 0)||(player == 2 && player2 == 1)){
			  System.out.println("あなたが勝ったので先行です");
			  fast = player;
			  second = player2;
			  break;
		  }else if((player2 == 0 && player == 2)||(player2 == 1 && player == 0)||(player2 == 2 && player == 1)) {
			  System.out.println("相手が勝ったのであなたは後攻です");
			  fast = player2;
			  second = player;
			  break;
		  }else {
			System.out.println("あいこです。もう一度入力をお願いします");
			continue;
		  }
		  }
		  
		  System.out.println("ジャンケンで順番が決まりましたので丸罰」ゲームを開始します");
		  System.out.println("ゲームのルールは先に同じ記号が３つ揃ったらその人の勝ちです");
		  System.out.println("丸罰の位置です");
		  System.out.println("1,2,3\n4,5,6\n7,8,9");
		  
		  List<Integer> number1 = new ArrayList<Integer>();
		  List<Integer> number2 = new ArrayList<Integer>();
		  
		  int[][] fild = {{1,2,3},{4,5,6},{7,8,9}};
		  
		  
		  //	配列の箇所にどの数字を置いたら位置を指定できるか
		  //    先手と後手が入力した値で配列fildに入れる方法
  		  //    丸罰ゲームの勝利条件の作り方
          //　　配列を1~9まで作る
		  //Array.asList().containsは配列の調査メソッド
		 
 			 if(fast==player) {
				System.out.println("先手の人は入力した位置を○とします");
				
				for(int  i = 0; i<fild.length; i++){
					
					System.out.println("あなたの番なのでどこに〇を置くのか入力してください");
					System.out.println("1,2,3\n4,5,6\n7,8,9");
					
					number1.add(sc.nextInt()); 
					
				
						
							System.out.println("あなたはの選択位置"+number1);
						
					
				 if(Arrays.asList(number1).contains(number2)) {
							System.out.println("相手との値がかぶっています");
							System.out.println("ゲームを終了します");
							System.exit(0);
						}
					
					if(number1.contains(1) && number1.contains(2) && number1.contains(3) ) {
						
						System.out.println("1,2,3がそろったのであなたの勝ちです");
						
					}else if(number1.contains(1) && number1.contains(4) && number1.contains(7) ) {
						System.out.println("1,4,7がそろったのであなたの勝ちです");
						System.exit(0);
						
					}else if(number1.contains(1) && number1.contains(5) && number1.contains(9)) {
				    	
						System.out.println("1,5,9がそろったのであなたの勝ちです");
						System.exit(0);
						
						
				    }else if(number1.contains(3) && number1.contains(6) && number1.contains(9) ) {
						System.out.println("3,6,9がそろったのであなたの勝ちです");
						System.exit(0);
						
				    }else if(number1.contains(3) && number1.contains(5) && number1.contains(7) ) {
						System.out.println("3,5,7がそろったのであなたの勝ちです");
						System.exit(0);
						
				    }else if(number1.contains(4) && number1.contains(5) && number1.contains(6) ) {
						System.out.println("4,5,6がそろったのであなたの勝ちです");
						System.exit(0);
						
				    }else if(number1.contains(2) && number1.contains(5) && number1.contains(8) ) {
						System.out.println("2,5,8がそろったのであなたの勝ちです");
						System.exit(0);
						
				    }else if(number1.contains(7) && number1.contains(8) && number1.contains(9) ) {
						System.out.println("7,8,9がそろったのであなたの勝ちです");
						System.exit(0);
				    }
					
					System.out.println("相手の番なので入力をしてください");
					System.out.println("1,2,3\n4,5,6\n7,8,9");
                    number2.add(sc.nextInt()); 
					
					
						
							System.out.println("あいて選択位置"+number2);
						
					
				      if(Arrays.asList(number2).contains(number1)) {
							System.out.println("あなたとの値がかぶっています");
							System.out.println("ゲームを終了します");
							System.exit(0);
							
						}
					
					if(number2.contains(1) && number2.contains(2) && number2.contains(3) ) {
						
						System.out.println("1,2,3がそろったのであいての勝ちです");
						
					}else if(number2.contains(1) && number2.contains(4) && number2.contains(7) ) {
						System.out.println("1,4,7がそろったのであいての勝ちです");
						System.exit(0);
						
					}else if(number2.contains(1) && number2.contains(5) && number2.contains(9)) {
				    	
						System.out.println("1,5,9がそろったのであいての勝ちです");
						System.exit(0);
						
						
				    }else if(number2.contains(3) && number2.contains(6) && number2.contains(9) ) {
						System.out.println("3,6,9がそろったのであいての勝ちです");
						System.exit(0);
						
				    }else if(number2.contains(3) && number2.contains(5) && number2.contains(7) ) {
						System.out.println("3,5,7がそろったのであいての勝ちです");
						System.exit(0);
						
				    }else if(number2.contains(4) && number2.contains(5) && number2.contains(6) ) {
						System.out.println("4,5,6がそろったのであなたの勝ちです");
						System.exit(0);
						
				    }else if(number2.contains(2) && number2.contains(5) && number2.contains(8) ) {
						System.out.println("2,5,8がそろったのであいての勝ちです");
						System.exit(0);
						
				    }else if(number2.contains(7) && number2.contains(8) && number2.contains(9) ) {
						System.out.println("7,8,9がそろったのであいての勝ちです");
						System.exit(0);
				    }
					
					
 			 
	 }
 			 }	 	
				if(second==player) {
					System.out.println("先手の人は入力した位置を○とします");
					
					for(int  i = 0; i<fild.length; i++){
			
					
					System.out.println("相手の番なので入力をしてください");
					System.out.println("1,2,3\n4,5,6\n7,8,9");
                    number1.add(sc.nextInt()); 
					
					
						
							System.out.println("あいて選択位置"+number1);
						
					
					if(Arrays.asList(number1).contains(number2)) {
							System.out.println("あなたとの値がかぶっています");
							System.out.println("ゲームを終了します");
							System.exit(0);
							
						}
					
					if(number1.contains(1) && number1.contains(2) && number1.contains(3) ) {
						
						System.out.println("1,2,3がそろったのであいての勝ちです");
						
					}else if(number1.contains(1) && number1.contains(4) && number1.contains(7) ) {
						System.out.println("1,4,7がそろったのであいての勝ちです");
						System.exit(0);
						
					}else if(number1.contains(1) && number1.contains(5) && number1.contains(9)) {
				    	
						System.out.println("1,5,9がそろったのであいての勝ちです");
						System.exit(0);
						
						
				    }else if(number1.contains(3) && number1.contains(6) && number1.contains(9) ) {
						System.out.println("3,6,9がそろったのであいての勝ちです");
						System.exit(0);
						
				    }else if(number1.contains(3) && number1.contains(5) && number1.contains(7) ) {
						System.out.println("3,5,7がそろったのであいての勝ちです");
						System.exit(0);
						
				    }else if(number1.contains(4) && number1.contains(5) && number1.contains(6) ) {
						System.out.println("4,5,6がそろったのであなたの勝ちです");
						System.exit(0);
						
				    }else if(number1.contains(2) && number1.contains(5) && number1.contains(8) ) {
						System.out.println("2,5,8がそろったのであいての勝ちです");
						System.exit(0);
						
				    }else if(number1.contains(7) && number1.contains(8) && number1.contains(9) ) {
						System.out.println("7,8,9がそろったのであいての勝ちです");
						System.exit(0);
				    }
					
					System.out.println("あなたの番なのでどこに〇を置くのか入力してください");
											
						System.out.println("1,2,3\n4,5,6\n7,8,9");
						number2.add(sc.nextInt()); 
						
						
							
								System.out.println("あなたはの選択位置"+number2);
							
						
						if(Arrays.asList(number1).contains(number2)) {
								System.out.println("相手との値がかぶっています");
								System.out.println("ゲームを終了します");
								System.exit(0);
							}
						
						if(number2.contains(1) && number2.contains(2) && number2.contains(3) ) {
							
							System.out.println("1,2,3がそろったのであなたの勝ちです");
							
						}else if(number2.contains(1) && number2.contains(4) && number2.contains(7) ) {
							System.out.println("1,4,7がそろったのであなたの勝ちです");
							System.exit(0);
							
						}else if(number2.contains(1) && number2.contains(5) && number2.contains(9)) {
					    	
							System.out.println("1,5,9がそろったのであなたの勝ちです");
							System.exit(0);
							
							
					    }else if(number2.contains(3) && number2.contains(6) && number2.contains(9) ) {
							System.out.println("3,6,9がそろったのであなたの勝ちです");
							System.exit(0);
							
					    }else if(number2.contains(3) && number2.contains(5) && number2.contains(7) ) {
							System.out.println("3,5,7がそろったのであなたの勝ちです");
							System.exit(0);
							
					    }else if(number2.contains(4) && number2.contains(5) && number2.contains(6) ) {
							System.out.println("4,5,6がそろったのであなたの勝ちです");
							System.exit(0);
							
					    }else if(number2.contains(2) && number2.contains(5) && number2.contains(8) ) {
							System.out.println("2,5,8がそろったのであなたの勝ちです");
							System.exit(0);
							
					    }else if(number2.contains(7) && number2.contains(8) && number2.contains(9) ) {
							System.out.println("7,8,9がそろったのであなたの勝ちです");
							System.exit(0);
					    }
					
					
 			 
	 }
 			 
				 
					
				}		
				}
					
					
			        
			        
				    	
				
		        
				
				
				 
			 }
			 
			  
			  
			  
		  

	
		  
	    

