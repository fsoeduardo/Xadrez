package main;

import javax.swing.*;

public class Main {
	/*
		Usando notação algébrica em inglês para definir a posição inicial do tabuleiro
		Letras minúsculas indicam peças pretas e maiúsculas, brancas
		K = King
		Q = Queen
		N = Knight
		B = Bishop
		R = Rook
		P = Pawn
	*/
	static String TABULEIRO[][]={
			{"r", "n", "b", "q", "k", "b", "n", "r"},
			{"p", "p", "p", "p", "p", "p", "p", "p"},
			{" ", " ", " ", " ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " ", " ", " ", " "},
			{"P", "P", "P", "P", "P", "P", "P", "P"},
			{"R", "N", "B", "Q", "K", "B", "N", "R"},
	};
	
	//Usado para conferir se o rei está em xeque
	static int posicaoReiBranco, posicaoReiPreto;
	
	public static void main(String[] args) {
		Interface ui = new Interface();
		
		JFrame frame = new JFrame("Xadrez");
		frame.add(ui);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(512, 534);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	public static String movimentosValidos() {
        String list="";
        for (int i=0; i<64; i++) {
            switch (TABULEIRO[i/8][i%8]) {
                case "P": list+=validoP(i);
                    break;
                case "R": list+=validoR(i);
                    break;
                case "N": list+=validoN(i);
                    break;
                case "B": list+=validoB(i);
                    break;
                case "Q": list+=validoQ(i);
                    break;
                case "K": list+=validoK(i);
                    break;
            }
        }
        return list;
    }
	
	public static String validoP(int i) {
        String list="";
        return list;
    }
	public static String validoR(int i) {
        String list="";
        return list;
    }
	public static String validoN(int i) {
        String list="";
        return list;
    }
	public static String validoB(int i) {
        String list="";
        return list;
    }
	public static String validoQ(int i) {
        String list="";
        return list;
    }
	public static String validoK(int i) {
        String list="";
        return list;
    }
	
	public static void movimenta(String m) {
        if (m.charAt(4)!='P') {
            TABULEIRO[Character.getNumericValue(m.charAt(2))][Character.getNumericValue(m.charAt(3))]=TABULEIRO[Character.getNumericValue(m.charAt(0))][Character.getNumericValue(m.charAt(1))];
            TABULEIRO[Character.getNumericValue(m.charAt(0))][Character.getNumericValue(m.charAt(1))]=" ";
            if ("K".equals(TABULEIRO[Character.getNumericValue(m.charAt(2))][Character.getNumericValue(m.charAt(3))])) {
                posicaoReiBranco=8*Character.getNumericValue(m.charAt(2))+Character.getNumericValue(m.charAt(3));
            }
        } /*else {
            //Promove peão
        	TABULEIRO[1][Character.getNumericValue(m.charAt(0))]=" ";
        	TABULEIRO[0][Character.getNumericValue(m.charAt(1))]=String.valueOf(m.charAt(3));
        }*/
    }
	
}
