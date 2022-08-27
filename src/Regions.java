public enum Regions {
    BATKEN ("The Batken region is famous for the Batken apricot, an amazing miracle is the Aigul flower, there are several tourist bases around the region: Ak-Suu, Ozgorush, Pyramide-Valley and Dugaba."),
    ISSYKKUL ("In the Issyk-Kul region you will find the Issyk-Kul lake, the Grigoryevskaya and Semyonovka gorges, the Altyn Arashan hot springs, the Tamga gorge with Tibetan petroglyphs."),
    NARYN ("In the Naryn region you will find the Chon-Tuz salt mines, Son-Kul Lake (at an altitude of over 3000m), the longest Naryn River, Eki-Naryn Valley, Salkyn-Tor National Park, Chatyr-Kul Lake and Ak-Sai Valley."),
    OSH ("In the Osh region you will find mount Sulaiman, which is located in the very center of the city of Osh, the beautiful Irkeshtam and Kyzyl-Art passes, the highest mountain with Lenin Peak."),
    JALALABAD ("In the Jalalabad region you will find Arslan-Bob walnut forests, one of the largest lakes and the Sary-Chelek nature reserve, the Besh-Aral national reserve and the Chatkal valley."),
    CHUY ("In the Chui valley you will find the majestic Konorchak canyons, the Boom gorge, the Red River and the beautiful Chon-Kemin valley."),
    TALAS ("In the Talas region you will find Besh Tash National Park, the village of Sheker - the birthplace of the writer Chingiz Aitmatov, Bazar-Kuporo in the east of the valley and several picturesque trekking routes.");

    private String descript;

    private Regions(String description) {
        this.descript = description;
    }

    public String getDescript() {
        return descript;
    }

    @Override
    public String toString() {
        return "Regions{" +
                "descript='" + descript + '\'' +
                '}';
    }
}
