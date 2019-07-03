package com.bhasker.dgstack.coreprg;
public class BinarySearchRan {

	public static void main(String[] args) {

		//discending order
	int arr[] = {9,6,5,4,3,2,1};
		search1(arr, 3);

	}

	public static void search1(int[] arr, int key) {

		int first = 0;
		int last = arr.length - 1;
		int mid = (first + last) / 2;

		while (true) {
			mid = (first + last) / 2;
			if (arr[mid] == key) {
				System.out.println("loc" + " " + mid);
				return;
			}
			if (arr[mid] < key) {
				last = mid - 1;
				continue;
			}
			if (arr[mid] > key) {
				first = mid + 1;
				continue;
			}

		}

	}
	
    //Ascending order
		
	/*int arr[] = {1, 2, 3, 4, 5, 7, 9 };
	search1(arr, 3);
	}
	
	public static void search1(int[] arr, int key) {

		int first = 0;
		int last = arr.length - 1;
		int mid = (first + last) / 2;

		while (true) {
			mid = (first + last) / 2;
			if (arr[mid] == key) {
				System.out.println("loc" + " " + mid);
				return;
			}
			if (arr[mid] < key) {
				first = mid + 1;
				continue;
			}
			if (arr[mid] > key) {
				last = mid - 1;
				continue;
			}

		}
*/
	}
