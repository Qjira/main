package Curriculum_New_1_17_1_18;
import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		//helloメソッドの呼び出し
		hello("Hello JavaSE", 11);
		//mulメソッドの呼び出し
		mul(5,4);

		//整数の配列の格納
		int i[] = {1, 3, 5, 8, 4, 1, 6};
		//numsメソッドの呼び出し
		nums(i);

		//オーバーロードしたmullメソッドの呼び出し
		mul(1.2,5.7);

		//配列numsに引数の回数分の要素数の要素をrndメソッドの呼び出しで格納
		int nums[] = rnd(5);

		//Q5の平均値を求めるメソッドの呼び出し
		double average = average(nums); 

		//Q6の値が50以上であるか判定するためのメソッドの呼び出し
		System.out.println(test(average));

	}

	//Q1
	//引数に文字列型と整数型を入れたメソッド
	public static void hello(String str, int i) {
		//Hello JavaSE 11の出力
		System.out.println(str + i);
	}

	//Q2
	//引数に整数を渡したメソッド
	public static void mul(int i,int j) {
		//渡された整数同士を乗算し出力
		System.out.println(i * j);
	}

	//Q3
	//引数に整数の配列を渡したメソッド
	public static void nums(int i[]) {
		//配列iの回数分繰り返し処理
		for(int j: i) {
			//配列i[j]の出力
			System.out.print(j + " ");
		}
		System.out.println();
	}

	//Q4
	//mulｍメソッドを引数を少数にしてオーバーロード
	public static void mul(double i,double j) {
		//少数同士の和算の出力
		System.out.println(i + j);
	}

	//Q5
	//引数のに整数を渡し、整数の配列を戻り値にしたメソッド
	public static int[] rnd(int i) {
		//インスタンス化
		Random rnd = new Random();

		//引数分の要素数の配列を生成
		int nums[] = new int[i];

		//配列numsの要素数分の繰り返し処理
		for(int j = 0; j < i; j++) {
			//配列numsのj番目の要素に1～100の乱数を代入
			nums[j]= rnd.nextInt(101) + 1;
			//j番目の要素の出力
			System.out.print(nums[j] + " ");
		}
		System.out.println();
		//配列numsを返す
		return nums;
	}

	//Q6
	//Q5のメソッドで作成した配列numsを引数にした配列numsの要素の平均値を求めるメソッド
	public static double average(int nums[]) {
		//少数を表示する平均値の初期化
		double average = 0; 
		//要素の合計値を求め、平均値を出すために繰り返し処理
		for(int i = 0; i < nums.length; i++) {
			average = (average*i + nums[i]) / (i + 1);
		}
		//平均値の出力
		System.out.println(average);
		//平均値を返す
		return average;
	}

	//Q7
	//Q6のメソッドで求めた平均値を引数とした50以上か判定するメソッド
	public static boolean test(double average) {
		//averageが50以上でtrue判定を行う処理
		return average >= 50;
	}
}