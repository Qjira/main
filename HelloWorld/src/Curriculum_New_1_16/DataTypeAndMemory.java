package Curriculum_New_1_16;

public class DataTypeAndMemory {

	public static void main(String[] args) {
		// Q1：「A」という文字列を変数に代入してコンソールに出力してください。

		//strにAを代入
		String str = "A";
		//出力
		System.out.println(str);

		// Q2：「Hello Java」という文字列を変数に代入してコンソールに出力してください。
		str = "Hello Java";
		//Hello Javaの出力
		System.out.println(str);

		// Q3：富士山の標高を整数で変数に代入してコンソールに出力してください。

		//int型変数Fujiに富士山の標高を代入
		int fuji = 3776;
		//出力
		System.out.println(fuji);

		// Q4：円周率を小数点第二位まで変数に代入してコンソールに出力してください。

		//double型変数piに円周率第2まで代入
		double pi = 3.14;
		//出力
		System.out.println(pi);

		// Q5：変数numsに「10, 100, 1000」が格納された配列を代入して、コンソールにメモリの番地が1のデータを出力してください。

		//配列numsに代入
		int nums[] = {10, 100, 1000};
		//メモリの番地が1のデータを出力
		System.out.println(nums[1]);

		// Q6：Q5で作成した変数numsを変数bに代入し、その後変数bのメモリの番地が1のデータを「8」に上書きさせて
		//     コンソールに変数numsと変数bのメモリの番地が1のデータを出力させて、変数nums値が変わることを確認してください。

		//配列bを作成、numsを代入
		int b[] = nums;
		//bのメモリの番地が1のデータを8に上書き
		b[1] = 8;
		//nums,bそれぞれのメモリの番地が1のデータを出力
		System.out.println(b[1] + " " + nums[1]);
	}

}
