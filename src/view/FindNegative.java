package view;

import controller.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class FindNegative {
	public static void main(String[] args) {
		Random gen = new Random();
		int size = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite o tamanho do vetor"));
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = gen.nextInt();
		}

		for (int i : array) {
			System.out.println(i);
		}

		System.out.print("\n");

		FindNegativeController.negativeFinder(array, size - 1);
	}
}
