package com.practice.linkedList;

import java.util.Scanner;

//class Node
//{
//	int data;
//	Node next;
//	Node bottom;
//	
//	Node(int data){
//		this.data = data;
//		this.next = null;
//		this.bottom = null;
//	}
//}

public class FlattenTheLL {

	Node head;
	
	//print the Flattened list
	void printList(Node node)
	{
		while(node != null)
		{
			System.out.print(node.data);
			node = node.bottom;
		}
		System.out.println("|");
	}
	
	public static void main(String[] args) 
	{		
		FlattenTheLL list =new FlattenTheLL();
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter N :");
		int t = sc.nextInt();
		
		while(t>0)
		{
			System.out.println("Enter number of root nodes ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			System.out.println("ENter element of Root Nodes");
			for(int i=0; i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			
			Node temp = null;
			Node tempB = null;
			Node pre = null;
			Node preB = null;
			
			int flag = 1;
			int flag1 = 1;
			
			for(int i=0; i< n ;i++)
			{
				int m = arr[i];
				m--;
				int a1 = sc.nextInt();
				temp = new Node(a1);
				if(flag == 1)
				{
					list.head = temp;
					pre = temp;
					flag = 0;
					flag1 = 1;
				}
				else
				{
					pre.next = temp;
					pre = temp;
					flag1 = 1;
				}
				
				for(int j=0;j<m;j++)
				{
					int a = sc.nextInt();
					tempB = new Node(a);
					if(flag1 == 1)
					{
						temp.bottom = tempB;
						preB = tempB;
						flag1 = 0;
					}
					else
					{
						preB.bottom = tempB;
						preB = tempB;
					}
				}
			}
			
			Flatten f =new Flatten();
			Node root = f.flattenLL(list.head);
			list.printList(root);
		t--;	
		}
		sc.close();
	}

}

// Driver code ends

class Flatten
{
	Node mergeTwoLists(Node a, Node b)
	{
		Node head = new Node(0);
		Node curr = head;
		
		while(a != null && b != null)
		{
			if(a.data <= b.data)
			{
				curr.bottom = a;
				a = a.next;
				curr = curr.next;
			}
			else
			{
				curr.bottom = b;
				b = b.bottom;
				curr = curr.bottom;
			}
			
			//assign the left out nodes to curr.next
			if(a != null && curr != null)
			{
			    curr.bottom = a;
			}
			
			else if(b != null && curr != null)
			{
			    curr.bottom = b;
			}
			//curr.bottom = a != null ? a : b;
		}
		
		return head.bottom;
	}
	
	Node flattenLL(Node root)
	{
		if(root == null || root.next == null)
		{
			return root;
		}
		
		root = mergeTwoLists(root, flattenLL(root.next)); 
		
		return root;
	}
}
