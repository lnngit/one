package com.lnn;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Node {
	
	public static void main(String[] args) {
		Node node = new Node(2);
		node.sort();
	}
	private List<Node> children;
	private int data;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int sum(Node node) {
		if (node == null) {
			return 0;
		}
		int sum = node.data;
		for (Node child : node.children) {
			sum += sum(child);
		}
		return sum;
	}

	public void sort() {
		
		int[] array = { 2, 2, 3, 3, 3, 3, 5, 9, 5, 10, 10, 9, 7 };
		
		Map<Integer, Long> collect = Arrays.stream(array).filter(x-> x%2==1).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
	}

	private int sum(int sum, Node node) {
		if (node != null) {
			sum += node.data;
			if (node.children != null) {
				for (Node child : node.children) {
					sum += sum(sum, child);
				}
			}
		}
		return sum;
	}

}
