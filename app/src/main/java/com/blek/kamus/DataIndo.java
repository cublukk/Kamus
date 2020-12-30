package com.blek.kamus;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataIndo extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "kamusid";
    public static final String INDONESIA= "indonesia";
    public static final String JAWA = "jawa";
	public DataIndo(Context context){
        super(context, DATABASE_NAME, null, 1);
    }
	
	public void createTable(SQLiteDatabase db){
        db.execSQL("DROP TABLE IF EXISTS kamus");
        db.execSQL("CREATE TABLE if not exists kamus (id INTEGER PRIMARY KEY AUTOINCREMENT, indonesia TEXT, jawa TEXT);");
    }

	public void generateData(SQLiteDatabase db){
        ContentValues cv=new ContentValues();
        cv.put(INDONESIA, "aba-aba");
        cv.put(JAWA, "Perintah");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "abad");
        cv.put(JAWA, "Abad");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "abadi");
        cv.put(JAWA, "Langgeng");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "abah");
        cv.put(JAWA, "Pa'e");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "ayah");
        cv.put(JAWA, "Pa'e");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "abai");
        cv.put(JAWA, "Nengne");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "abang");
        cv.put(JAWA, "Mas");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "mpo");
        cv.put(JAWA, "Mba");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "abdi");
        cv.put(JAWA, "Batur");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "mengabdi");
        cv.put(JAWA, "Ngabdi");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "abjad");
        cv.put(JAWA, "Aksara");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "abnormal");
        cv.put(JAWA, "Ora normal");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "abon");
        cv.put(JAWA, "Abon");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "absah");
        cv.put(JAWA, "Resmi");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "resmi");
        cv.put(JAWA, "Sah");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "absen");
        cv.put(JAWA, "Nglimput");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "abu");
        cv.put(JAWA, "Lebu");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "abu-abu");
        cv.put(JAWA, "Klawu");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "acak");
        cv.put(JAWA, "Awur");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "sering");
        cv.put(JAWA, "Kerep");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "acar");
        cv.put(JAWA, "Acar");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "acara");
        cv.put(JAWA, "Acara");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "acuh");
        cv.put(JAWA, "Cuek");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "ada");
        cv.put(JAWA, "Ono");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "adab");
        cv.put(JAWA, "Tata krama");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "yaitu");
        cv.put(JAWA, "Yaiku");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "adalah");
        cv.put(JAWA, "Yaiku");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "adzan");
        cv.put(JAWA, "Adan");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "hadang");
        cv.put(JAWA, "Cegat");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "adat");
        cv.put(JAWA, "Adat");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "dingin");
        cv.put(JAWA, "Anyes");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "adik");
        cv.put(JAWA, "Adhi");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "mengadoni");
        cv.put(JAWA, "Ngadoni");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "aduan");
        cv.put(JAWA, "Adon");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "beradu");
        cv.put(JAWA, "Gathuk");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "sisir");
        cv.put(JAWA, "Jungkat");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "mengadu");
        cv.put(JAWA, "Ngadu");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "aduk");
        cv.put(JAWA, "Udhek");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "agak");
        cv.put(JAWA, "Rada");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "gemuk");
        cv.put(JAWA, "Lemu");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "agama");
        cv.put(JAWA, "Agami");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "agar");
        cv.put(JAWA, "Supaya");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "agar-agar");
        cv.put(JAWA, "Ager-ager");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "agenda");
        cv.put(JAWA, "Acara");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "agung");
        cv.put(JAWA, "Luhur");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "ahli");
        cv.put(JAWA, "Pinter");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "bodoh");
        cv.put(JAWA, "Goblog");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "air");
        cv.put(JAWA, "Banyu");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "ajaib");
        cv.put(JAWA, "Aneh");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "mengajak");
        cv.put(JAWA, "Ngajak");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "ajal");
        cv.put(JAWA, "Ajal");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "anjing");
        cv.put(JAWA, "Asu");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "anak anjing");
        cv.put(JAWA, "Kirik");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "ajang perang");
        cv.put(JAWA, "Palagan");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "kurang ajar");
        cv.put(JAWA, "Murang tata");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "pelajar");
        cv.put(JAWA, "Siswa");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "mengaji");
        cv.put(JAWA, "Ngaji");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "akan");
        cv.put(JAWA, "Arep");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "akar");
        cv.put(JAWA, "Oyot");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "berakar");
        cv.put(JAWA, "Ngoyot");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "akbar");
        cv.put(JAWA, "Agung");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "akhir");
        cv.put(JAWA, "Akir");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "berakhir");
        cv.put(JAWA, "Rampung");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "kakek");
        cv.put(JAWA, "Mbah Kakung");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "nenek");
        cv.put(JAWA, "Mbah Putri");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "akibat");
        cv.put(JAWA, "Amergo");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "batu bancang");
        cv.put(JAWA, "Watu akik");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "akur");
        cv.put(JAWA, "Rukun");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "akrab");
        cv.put(JAWA, "Akrab");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "aksen");
        cv.put(JAWA, "Logat");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "rajin");
        cv.put(JAWA, "Sregep");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "aku");
        cv.put(JAWA, "Kulo");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "akurat");
        cv.put(JAWA, "Pasti");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "alam");
        cv.put(JAWA, "Bumi");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "alas");
        cv.put(JAWA, "Dasar");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "alasan");
        cv.put(JAWA, "Alesan");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "alas");
        cv.put(JAWA, "Taplak");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "manja");
        cv.put(JAWA, "Aleman");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "algojo");
        cv.put(JAWA, "Jurupati");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "alih");
        cv.put(JAWA, "Alih");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "alim");
        cv.put(JAWA, "Anteng");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "alir");
        cv.put(JAWA, "Kocor");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "almarhum");
        cv.put(JAWA, "Swargi");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "lemari");
        cv.put(JAWA, "Panto");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "aman");
        cv.put(JAWA, "Tentrem");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "amanat");
        cv.put(JAWA, "Weling");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "jauh");
        cv.put(JAWA, "Adoh");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "ambeien");
        cv.put(JAWA, "Dhobol");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "ambil");
        cv.put(JAWA, "Pundhut");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "rubuh");
        cv.put(JAWA, "Ambruk");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "burung");
        cv.put(JAWA, "Manuk");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "ampas");
        cv.put(JAWA, "Sepahan");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "abang");
        cv.put(JAWA, "Mas");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "dalam");
        cv.put(JAWA, "Jero");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "ampuh");
        cv.put(JAWA, "Sekti");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "anak");
        cv.put(JAWA, "Anak");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "beranak");
        cv.put(JAWA, "Bayen");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "ajaib");
        cv.put(JAWA, "Aneh");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "kamu");
        cv.put(JAWA, "Sampean");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "andai kata");
        cv.put(JAWA, "Umpama");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "anggap");
        cv.put(JAWA, "Anggep");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "angin");
        cv.put(JAWA, "Bayu");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "anggun");
        cv.put(JAWA, "Anggun");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "angkasa");
        cv.put(JAWA, "Awang-Awang");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "angkat");
        cv.put(JAWA, "Junjung");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "angsa");
        cv.put(JAWA, "Banyak");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "antara");
        cv.put(JAWA, "Elet");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "anti");
        cv.put(JAWA, "Emoh");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "antik");
        cv.put(JAWA, "Kuno");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "anus");
        cv.put(JAWA, "Silit");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "baru");
        cv.put(JAWA, "Anyar");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "apabila");
        cv.put(JAWA, "Yen");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "aparat");
        cv.put(JAWA, "Piranti");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "sial");
        cv.put(JAWA, "Apes");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "api");
        cv.put(JAWA, "Geni");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "arah");
        cv.put(JAWA, "Ener");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "orang");
        cv.put(JAWA, "Wong");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "arca");
        cv.put(JAWA, "Reca");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "arif");
        cv.put(JAWA, "Wicaksono");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "ikan");
        cv.put(JAWA, "Iwak");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "jangan");
        cv.put(JAWA, "Ojo");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "tidak");
        cv.put(JAWA, "Ora");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "manis");
        cv.put(JAWA, "Legi");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "naik");
        cv.put(JAWA, "Numpa");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "mandi");
        cv.put(JAWA, "Adus");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "berak");
        cv.put(JAWA, "Ngising");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "arwah");
        cv.put(JAWA, "Roh");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "batu asahan");
        cv.put(JAWA, "Ungkal");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "berapa");
        cv.put(JAWA, "Piro");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "banyak");
        cv.put(JAWA, "Akeh");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "asam");
        cv.put(JAWA, "Asem");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "terang");
        cv.put(JAWA, "Padang");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "asmara");
        cv.put(JAWA, "Semsem");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "sama");
        cv.put(JAWA, "Podo");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "dengan");
        cv.put(JAWA, "Karo");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "lagi");
        cv.put(JAWA, "Meneh");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "atap");
        cv.put(JAWA, "Poyon");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "atau");
        cv.put(JAWA, "Utama");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "badan");
        cv.put(JAWA, "Awak");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "cape");
        cv.put(JAWA, "Kesel");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "ayam");
        cv.put(JAWA, "Pitik");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "kambing");
        cv.put(JAWA, "Wedus");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "cantik");
        cv.put(JAWA, "Ayu");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "babi");
        cv.put(JAWA, "Srenggono");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "nanti");
        cv.put(JAWA, "Mengko");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "baca");
        cv.put(JAWA, "Woco");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "cubit");
        cv.put(JAWA, "Jiwit");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "bisa");
        cv.put(JAWA, "Iso");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "makan");
        cv.put(JAWA, "Mangan");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "minum");
        cv.put(JAWA, "Ngombe");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "rokok");
        cv.put(JAWA, "Udut");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "bahenol");
        cv.put(JAWA, "Semok");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "bahkan");
        cv.put(JAWA, "Malahan");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "baik");
        cv.put(JAWA, "Apik");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "baja");
        cv.put(JAWA, "Waja");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "kotor");
        cv.put(JAWA, "Reget");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "laku");
        cv.put(JAWA, "Payu");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "datang");
        cv.put(JAWA, "Teko");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "pergi");
        cv.put(JAWA, "Lungoh");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "bakar");
        cv.put(JAWA, "Obong");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "sedikit");
        cv.put(JAWA, "Sitik");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "baling-baling");
        cv.put(JAWA, "Kitiran");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "itu");
        cv.put(JAWA, "Iku");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "takut");
        cv.put(JAWA, "Wedi");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "berani");
        cv.put(JAWA, "Wani");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "banci");
        cv.put(JAWA, "Wandu");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "bandit");
        cv.put(JAWA, "Bangsat");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "bangga");
        cv.put(JAWA, "Mongkok");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "apa");
        cv.put(JAWA, "Opo");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "kenapa");
        cv.put(JAWA, "Nopo");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "jalan");
        cv.put(JAWA, "Mlaku");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "tidur");
        cv.put(JAWA, "Turu");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "kaki");
        cv.put(JAWA, "Sikil");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "rumah");
        cv.put(JAWA, "Omah");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "marah");
        cv.put(JAWA, "Nesu");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "mau");
        cv.put(JAWA, "Gelem");
        db.insert("kamus", INDONESIA, cv);
        cv.put(INDONESIA, "bilangin");
        cv.put(JAWA, "Kandani");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "enak");
        cv.put(JAWA, "Wena");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "suka");
        cv.put(JAWA, "Seneng");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "malam");
        cv.put(JAWA, "Bengih");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "cinta");
        cv.put(JAWA, "Tresno");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "bangun");
        cv.put(JAWA, "Tangi");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "pulang");
        cv.put(JAWA, "Mulih");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "kesini");
        cv.put(JAWA, "Mriki");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "kesana");
        cv.put(JAWA, "Mriko");
        db.insert("kamus", INDONESIA, cv);
		cv.put(INDONESIA, "bau");
        cv.put(JAWA, "Mambu");
        db.insert("kamus", INDONESIA, cv);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}

    @Override
    public void onCreate(SQLiteDatabase db){}
}