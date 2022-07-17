package com.bridgelabztoe;

import java.util.Scanner;

public class TicTacToe {
    public enum CurrentPlayer{
        PLAYER,COMPUTER
    }
    static char[] board = new char[10];
    static Scanner scr = new Scanner(System.in);
    static char playerLetter;
    static char computerLetter;
    static int position;
    static void createBoard(char[] board){

        for(int i=1;i<10;i++){
            board[i]=' ';
        }
    }
 static void showBoard(char[] board){
    System.out.println(board[1]+"|"+board[2]+"|"+board[3]);
    System.out.println(board[4]+"|"+board[5]+"|"+board[6]);
    System.out.println(board[7]+"|"+board[8]+"|"+board[9]);
}
