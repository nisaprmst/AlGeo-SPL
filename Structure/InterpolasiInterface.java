interface InterpolasiInterface {

	Matrix matrix;		// augmented matrix dari titik"
	int N; 				// jumlah derajat polinom
	double[] polinom;	// polinomial hasil interpolasi
						// Cat : tingkat derajat polinom sesuai dengan n
	double[] arr_X;		// array untuk menyimpan nilai titik X
	double[] arr_Y;		// array untuk menyimpan nilai titik Y
	boolean allDefined = false;


	/*** Fungsi Input Titik ***/
	/** Fungsi mengambil inputan dari user secara langsung **/
	private void inputTitik();
	/* I.S. : Titik belum dimasukkan */
	/* F.S. : Titik telah terdefinisi */
	/* Kondisi Valid : Jumlah titik yang dimasukkan minimal 2, agar tidak menimbulkan keambiguan */

	/** Fungsi mengambil inputan melalui file **/
	public void inputTitikFile(String filename);
	/* I.S. : Titik belum dimasukkan, file terdefinisi */
	/* F.S. : Titik telah terdefinisi */
	/* Kondisi Valid : Jumlah titik yang dimasukkan minimal 2, agar tidak menimbulkan keambiguan */

	/*** Fungsi Lain ***/
	public String getOutputPolinom ();
	/* Mengembalikan string polinom hasil interpolasi */
	private static double [] getResultGaussian (Matrix matrix);
	/* Mengembalikan array hasil dari perhitungan Gauss-Jordan */
	public static double[] reverse(double a[], int n);
	/* Mengembalikan array yang elemennya sama dengan a tetapi dibalik urutannya */
	public static double getInterpolasi (boolean allDefined, double x, int N, double[] polinom);
	/* Mengembalikan nilai y hasil polinom */
	/* apabila ada parameter yang tidak terpenuhi mengembalikan -999 */
	public static double bacaTitikBaru() 
	/* Mengembalikan nilai titik yang dibaca lewat scanner */

	/*** Prosedur Lain */
	private void ubahPersLinear ();
	/* I. S. : Titik telah diinput kedalam objek*/
	/* F. S. : Terdapat augmented matrix dari persamaan garis nilai titik yang telah diinput */
	/* Fungsi mengubah titik" menjadi sistem persamaan linear (dalam bentuk augmented matrix) */
	private void polinomInterpolasi();
	/*I. S. Fungsi Polinom hasil interpolasi belum terdefinisi */
	/*F. S. Fungsi Polinom hasil interpolasi telah terdefinisi*/
	public void prosedurInterpolasi();
	/* Prosedur untuk menjalankan semua fungsi interpolasi */
}


