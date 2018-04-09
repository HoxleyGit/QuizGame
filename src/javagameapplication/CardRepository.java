/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagameapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository of all registry cards
 * @author Kamil Matecki
 */
public class CardRepository {
    
    //List of all registry cards
    private List<RegistryCard> registryCardList;
    private List<RegistryCard> dolnoslaskieCardList;
    private List<RegistryCard> kujawskoPomorskieCardList;
    private List<RegistryCard> lubelskieCardList;
    private List<RegistryCard> lubuskieCardList;
    private List<RegistryCard> lodzkieCardList;
    private List<RegistryCard> malopolskieCardList;
    private List<RegistryCard> mazowieckieCardList;
    private List<RegistryCard> opolskieCardList;
    private List<RegistryCard> podkarpackieCardList;
    private List<RegistryCard> podlaskieCardList;
    private List<RegistryCard> pomorskieCardList;
    private List<RegistryCard> slaskieCardList;
    private List<RegistryCard> swietokrzyskieCardList;
    private List<RegistryCard> warminskoMazurskieCardList;
    private List<RegistryCard> wielkopolskieCardList;
    private List<RegistryCard> zachodnioPomorskieCardList;
    
    
    /**
     * Contructor of CardRepository.java (create all cards)
     */
    public CardRepository(){
        this.registryCardList = new ArrayList<>();
        this.dolnoslaskieCardList = new ArrayList<>();
        this.kujawskoPomorskieCardList = new ArrayList<>();
        this.lubelskieCardList = new ArrayList<>();
        this.lubuskieCardList = new ArrayList<>();
        this.lodzkieCardList = new ArrayList<>();
        this.malopolskieCardList = new ArrayList<>();
        this.mazowieckieCardList = new ArrayList<>();
        this.opolskieCardList = new ArrayList<>();
        this.podkarpackieCardList = new ArrayList<>();
        this.podlaskieCardList = new ArrayList<>();
        this.pomorskieCardList = new ArrayList<>();
        this.slaskieCardList = new ArrayList<>();
        this.swietokrzyskieCardList = new ArrayList<>();
        this.warminskoMazurskieCardList = new ArrayList<>();
        this.wielkopolskieCardList = new ArrayList<>();
        this.zachodnioPomorskieCardList = new ArrayList<>();
        
        //dolnośląskie
        RegistryCard rC001 = new RegistryCard(1, "DBL", "Bolesławiec", "DOLNOŚLĄSKIE");
        RegistryCard rC002 = new RegistryCard(1, "DGL", "Głogów", "DOLNOŚLĄSKIE");
        RegistryCard rC003 = new RegistryCard(1, "DJA", "Jawor", "DOLNOŚLĄSKIE");
        RegistryCard rC004 = new RegistryCard(1, "DJE", "Jelenia Góra (powiat)", "DOLNOŚLĄSKIE");
        RegistryCard rC005 = new RegistryCard(1, "DKL", "Kłodzko", "DOLNOŚLĄSKIE");
        RegistryCard rC006 = new RegistryCard(1, "DLE", "Legnica (Powiat)", "DOLNOŚLĄSKIE");
        RegistryCard rC007 = new RegistryCard(1, "DLU", "Lubin", "DOLNOŚLĄSKIE");
        RegistryCard rC008 = new RegistryCard(1, "DMI", "Milcz", "DOLNOŚLĄSKIE");
        RegistryCard rC009 = new RegistryCard(1, "DOA", "Oława", "DOLNOŚLĄSKIE");
        RegistryCard rC010 = new RegistryCard(1, "DST", "Strzelin", "DOLNOŚLĄSKIE");
        RegistryCard rC011 = new RegistryCard(1, "DSW", "Świdnica", "DOLNOŚLĄSKIE");
        RegistryCard rC012 = new RegistryCard(1, "DB", "Wałbrzych", "DOLNOŚLĄSKIE");
        RegistryCard rC013 = new RegistryCard(1, "DWL", "Wołów", "DOLNOŚLĄSKIE");
        RegistryCard rC014 = new RegistryCard(1, "DWR", "Wrocław (Powiat)", "DOLNOŚLĄSKIE");
        RegistryCard rC015 = new RegistryCard(1, "DZG", "Zgorzelec", "DOLNOŚLĄSKIE");
        RegistryCard rC016 = new RegistryCard(1, "DDZ", "Dzierżoniów", "DOLNOŚLĄSKIE");
        RegistryCard rC017 = new RegistryCard(1, "DGR", "Góra", "DOLNOŚLĄSKIE");
        RegistryCard rC018 = new RegistryCard(1, "DJ", "Jelenia Góra", "DOLNOŚLĄSKIE");
        RegistryCard rC0185 = new RegistryCard(1, "DKA", "Kamienna Góra", "DOLNOŚLĄSKIE"); //missed it
        RegistryCard rC019 = new RegistryCard(1, "DL", "Legnica", "DOLNOŚLĄSKIE");
        RegistryCard rC020 = new RegistryCard(1, "DLB", "Lubań", "DOLNOŚLĄSKIE");
        RegistryCard rC021 = new RegistryCard(1, "DLW", "Lwówek Śląski", "DOLNOŚLĄSKIE");
        RegistryCard rC022 = new RegistryCard(1, "DOL", "Oleśnica", "DOLNOŚLĄSKIE");
        RegistryCard rC023 = new RegistryCard(1, "DPL", "Polkowice", "DOLNOŚLĄSKIE");
        RegistryCard rC024 = new RegistryCard(1, "DSR", "Środa Śląska", "DOLNOŚLĄSKIE");
        RegistryCard rC025 = new RegistryCard(1, "DTR", "Trzebnica", "DOLNOŚLĄSKIE");
        RegistryCard rC026 = new RegistryCard(1, "DBA", "Wałbrzych (Powiat)", "DOLNOŚLĄSKIE");
        RegistryCard rC027 = new RegistryCard(1, "DW", "Wrocław", " DOLNOŚLĄSKIE");
        RegistryCard rC028 = new RegistryCard(1, "DZA", "Ząbkowice Śląskie", "DOLNOŚLĄSKIE");
        RegistryCard rC029 = new RegistryCard(1, "DZL", "Złotoryja", "DOLNOŚLĄSKIE");
        
        //kujawsko-pomorskie
        RegistryCard rC030 = new RegistryCard(2, "CAL", "Aleksandrów Kujawski", "KUJAWSKO-POMORSKIE");
        RegistryCard rC031 = new RegistryCard(2, "CB", "Bydgoszcz", "KUJAWSKO-POMORSKIE");
        RegistryCard rC032 = new RegistryCard(2, "CCH", "Chełmno", "KUJAWSKO-POMORSKIE");
        RegistryCard rC033 = new RegistryCard(2, "CG", "Grudziądz", "KUJAWSKO-POMORSKIE");
        RegistryCard rC034 = new RegistryCard(2, "CIN", "Inowrocław", "KUJAWSKO-POMORSKIE");
        RegistryCard rC035 = new RegistryCard(2, "CMG", "Mogilno", "KUJAWSKO-POMORSKIE");
        RegistryCard rC036 = new RegistryCard(2, "CRA", "Radziejów", "KUJAWSKO-POMORSKIE");
        RegistryCard rC037 = new RegistryCard(2, "CSE", "Sępólno Krajeńskie", "KUJAWSKO-POMORSKIE");
        RegistryCard rC038 = new RegistryCard(2, "CT", "Toruń", "KUJAWSKO-POMORSKIE");
        RegistryCard rC039 = new RegistryCard(2, "CTU", "Tuchola", "KUJAWSKO-POMORSKIE");
        RegistryCard rC040 = new RegistryCard(2, "CW", "Włocławek", "KUJAWSKO-POMORSKIE");
        RegistryCard rC041 = new RegistryCard(2, "CZN", "Żnin", "KUJAWSKO-POMORSKIE");
        RegistryCard rC042 = new RegistryCard(2, "CBR", "Brodnica", "KUJAWSKO-POMORSKIE");
        RegistryCard rC043 = new RegistryCard(2, "CBY", "Bydgoszcz (Powiat)", "KUJAWSKO-POMORSKIE");
        RegistryCard rC044 = new RegistryCard(2, "CGD", "Golub Dobrzyń", "KUJAWSKO-POMORSKIE");
        RegistryCard rC045 = new RegistryCard(2, "CGR", "Grudziądz (Powiat)", "KUJAWSKO-POMORSKIE");
        RegistryCard rC046 = new RegistryCard(2, "CLI", "Lipno", "KUJAWSKO-POMORSKIE");
        RegistryCard rC047 = new RegistryCard(2, "CNA", "Nakło Nad Notecią", "KUJAWSKO-POMORSKIE");
        RegistryCard rC048 = new RegistryCard(2, "CRY", "Rypin", "KUJAWSKO-POMORSKIE");
        RegistryCard rC049 = new RegistryCard(2, "CSW", "Świecie", "KUJAWSKO-POMORSKIE");
        RegistryCard rC050 = new RegistryCard(2, "CTR", "Toruń (Powiat)", "KUJAWSKO-POMORSKIE");
        RegistryCard rC051 = new RegistryCard(2, "CWA", "Wąbrzeźno", "KUJAWSKO-POMORSKIE");
        RegistryCard rC052 = new RegistryCard(2, "CWL", "Włocławek (Powiat)", "KUJAWSKO-POMORSKIE");
        
        //lubelskie
        RegistryCard rC053 = new RegistryCard(3, "LB", "Biała Podlaska", "LUBELSKIE");
        RegistryCard rC054 = new RegistryCard(3, "LBL", "Biłgoraj", "LUBELSKIE");
        RegistryCard rC055 = new RegistryCard(3, "LCH", "Chełm (Powiat)", "LUBELSKIE");
        RegistryCard rC056 = new RegistryCard(3, "LJA", "Janów Lubelski", "LUBELSKIE");
        RegistryCard rC057 = new RegistryCard(3, "LKR", "Kraśnik", "LUBELSKIE");
        RegistryCard rC058 = new RegistryCard(3, "LU", "Lublin", "LUBELSKIE");
        RegistryCard rC059 = new RegistryCard(3, "LLE", "Łęczna", "LUBELSKIE");
        RegistryCard rC060 = new RegistryCard(3, "LOP", "Opole Lubelskie", "LUBELSKIE");
        RegistryCard rC061 = new RegistryCard(3, "LPU", "Puławy", "LUBELSKIE");
        RegistryCard rC062 = new RegistryCard(3, "LRY", "Ryki", "LUBELSKIE");
        RegistryCard rC063 = new RegistryCard(3, "LTM", "Tomaszów Lubelski", "LUBELSKIE");
        RegistryCard rC064 = new RegistryCard(3, "LZ", "Zamość", "LUBELSKIE");
        RegistryCard rC065 = new RegistryCard(3, "LBI", "Biała Podlaska (Powiat)", "LUBELSKIE");
        RegistryCard rC066 = new RegistryCard(3, "LC", "Chełm", "LUBELSKIE");
        RegistryCard rC067 = new RegistryCard(3, "LHR", "Hrubieszów", "LUBELSKIE");
        RegistryCard rC068 = new RegistryCard(3, "LKS", "Krasnystaw", "LUBELSKIE");
        RegistryCard rC069 = new RegistryCard(3, "LLB", "Lubartów", "LUBELSKIE");
        RegistryCard rC070 = new RegistryCard(3, "LUB", "Lublin (Powiat)", "LUBELSKIE");
        RegistryCard rC071 = new RegistryCard(3, "LLU", "Łuków", "LUBELSKIE");
        RegistryCard rC072 = new RegistryCard(3, "LPA", "Parczew", "LUBELSKIE");
        RegistryCard rC073 = new RegistryCard(3, "LRA", "Radzyń Podlaski", "LUBELSKIE");
        RegistryCard rC074 = new RegistryCard(3, "LSW", "Świdnik", "LUBELSKIE");
        RegistryCard rC075 = new RegistryCard(3, "LWL", "Włodawa", "LUBELSKIE");
        RegistryCard rC076 = new RegistryCard(3, "LZA", "Zamość (Powiat)", "LUBELSKIE");
        
        //lubuskie
        RegistryCard rC077 = new RegistryCard(4, "FSD", "Drezdenko", "LUBUSKIE");
        RegistryCard rC078 = new RegistryCard(4, "FGW", "Gorzów Wlkp. (Powiat)", "LUBUSKIE");
        RegistryCard rC079 = new RegistryCard(4, "FMI", "Międzyrzecz", "LUBUSKIE");
        RegistryCard rC080 = new RegistryCard(4, "FSL", "Słubice", "LUBUSKIE");
        RegistryCard rC081 = new RegistryCard(4, "FSW", "Świebodzin", "LUBUSKIE");
        RegistryCard rC082 = new RegistryCard(4, "FZI", "Zielona Góra (Powiat)", "LUBUSKIE");
        RegistryCard rC083 = new RegistryCard(4, "FZA", "Żary", "LUBUSKIE");
        RegistryCard rC084 = new RegistryCard(4, "FG", "Gorzów Wielkopolski", "LUBUSKIE");
        RegistryCard rC085 = new RegistryCard(4, "FKR", "Krosno Odrzańskie", "LUBUSKIE");
        RegistryCard rC086 = new RegistryCard(4, "FNW", "Nowa Sól", "LUBUSKIE");
        RegistryCard rC087 = new RegistryCard(4, "FSU", "Sulęcin", "LUBUSKIE");
        RegistryCard rC088 = new RegistryCard(4, "FZ", "Zielona Góra", "LUBUSKIE");
        RegistryCard rC089 = new RegistryCard(4, "FZG", "Żagań", "LUBUSKIE");
        
        //łódzkie
        RegistryCard rC090 = new RegistryCard(5, "EBE", "Bełchatów", "ŁÓDZKIE");
        RegistryCard rC091 = new RegistryCard(5, "ELA", "Łask", "ŁÓDZKIE");
        RegistryCard rC092 = new RegistryCard(5, "ELC", "Łowicz", "ŁÓDZKIE");
        RegistryCard rC093 = new RegistryCard(5, "ELW", "Łódź (Powiat)", "ŁÓDZKIE");
        RegistryCard rC094 = new RegistryCard(5, "EPA", "Pabianice", "ŁÓDZKIE");
        RegistryCard rC095 = new RegistryCard(5, "EPI", "Piotrków Tryb. (Powiat)", "ŁÓDZKIE");
        RegistryCard rC096 = new RegistryCard(5, "EPD", "Poddębice", "ŁÓDZKIE");
        RegistryCard rC097 = new RegistryCard(5, "ERW", "Rawa Mazowiecka", "ŁÓDZKIE");
        RegistryCard rC098 = new RegistryCard(5, "ES", "Skierniewice", "ŁÓDZKIE");
        RegistryCard rC099 = new RegistryCard(5, "ETM", "Tomaszów Mazowiecki", "ŁÓDZKIE");
        RegistryCard rC100 = new RegistryCard(5, "EWE", "Wieruszów", "ŁÓDZKIE");
        RegistryCard rC101 = new RegistryCard(5, "EZG", "Zgierz", "ŁÓDZKIE");
        RegistryCard rC102 = new RegistryCard(5, "EKU", "Kutno", "ŁÓDZKIE");
        RegistryCard rC103 = new RegistryCard(5, "ELE", "Łęczyca", "ŁÓDZKIE");
        RegistryCard rC104 = new RegistryCard(5, "EL", "Łódź", "ŁÓDZKIE");
        RegistryCard rC105 = new RegistryCard(5, "EOP", "Opoczno", "ŁÓDZKIE");
        RegistryCard rC106 = new RegistryCard(5, "EPJ", "Pajęczno", "ŁÓDZKIE");
        RegistryCard rC107 = new RegistryCard(5, "EP", "Piotrków Trybunalski", "ŁÓDZKIE");
        RegistryCard rC108 = new RegistryCard(5, "ERA", "Radomsko", "ŁÓDZKIE");
        RegistryCard rC109 = new RegistryCard(5, "ESI", "Sieradz", "ŁÓDZKIE");
        RegistryCard rC110 = new RegistryCard(5, "ESK", "Skierniewice (Powiat)", "ŁÓDZKIE");
        RegistryCard rC111 = new RegistryCard(5, "EWI", "Wieluń", "ŁÓDZKIE");
        RegistryCard rC112 = new RegistryCard(5, "EZD", "Zduńska Wola", "ŁÓDZKIE");
        
        //małopolskie
        RegistryCard rC113 = new RegistryCard(6, "KBC", "Bochnia", "MAŁOPOLSKIE");
        RegistryCard rC114 = new RegistryCard(6, "KCH", "Chrzanów", "MAŁOPOLSKIE");
        RegistryCard rC115 = new RegistryCard(6, "KGR", "Gorlice", "MAŁOPOLSKIE");
        RegistryCard rC116 = new RegistryCard(6, "KRA", "Kraków (Powiat)", "MAŁOPOLSKIE");
        RegistryCard rC117 = new RegistryCard(6, "KMI", "Miechów", "MAŁOPOLSKIE");
        RegistryCard rC118 = new RegistryCard(6, "KN", "Nowy Sącz", "MAŁOPOLSKIE");
        RegistryCard rC119 = new RegistryCard(6, "KNT", "Nowy Targ", "MAŁOPOLSKIE");
        RegistryCard rC120 = new RegistryCard(6, "KOS", "Oświęcim", "MAŁOPOLSKIE");
        RegistryCard rC121 = new RegistryCard(6, "KSU", "Sucha Beskidzka", "MAŁOPOLSKIE");
        RegistryCard rC122 = new RegistryCard(6, "KTA", "Tarnów (Powiat)", "MAŁOPOLSKIE");
        RegistryCard rC123 = new RegistryCard(6, "KWI", "Wieliczka", "MAŁOPOLSKIE");
        RegistryCard rC124 = new RegistryCard(6, "KBR", "Brzesko", "MAŁOPOLSKIE");
        RegistryCard rC125 = new RegistryCard(6, "KDA", "Dąbrowa Tarnowska", "MAŁOPOLSKIE");
        RegistryCard rC126 = new RegistryCard(6, "KR", "Kraków", "MAŁOPOLSKIE");
        RegistryCard rC127 = new RegistryCard(6, "KLI", "Limanowa", "MAŁOPOLSKIE");
        RegistryCard rC128 = new RegistryCard(6, "KMY", "Myślenice", "MAŁOPOLSKIE");
        RegistryCard rC129 = new RegistryCard(6, "KNS", "Nowy Sącz (Powiat)", "MAŁOPOLSKIE");
        RegistryCard rC130 = new RegistryCard(6, "KOL", "Olkusz", "MAŁOPOLSKIE");
        RegistryCard rC131 = new RegistryCard(6, "KPR", "Proszowice", "MAŁOPOLSKIE");
        RegistryCard rC132 = new RegistryCard(6, "KT", "Tarnów", "MAŁOPOLSKIE");
        RegistryCard rC133 = new RegistryCard(6, "KWA", "Wadowice", "MAŁOPOLSKIE");
        RegistryCard rC134 = new RegistryCard(6, "KTT", "Zakopane", "MAŁOPOLSKIE");
        
        //mazowieckie
        RegistryCard rC135 = new RegistryCard(7, "WBR", "Białobrzegi", "MAZOWIECKIE");
        RegistryCard rC136 = new RegistryCard(7, "WG", "Garwolin", "MAZOWIECKIE");
        RegistryCard rC137 = new RegistryCard(7, "WGM", "Grodzisk Mazowiecki", "MAZOWIECKIE");
        RegistryCard rC138 = new RegistryCard(7, "WKZ", "Kozienice", "MAZOWIECKIE");
        RegistryCard rC139 = new RegistryCard(7, "WLI", "Lipsko", "MAZOWIECKIE");
        RegistryCard rC140 = new RegistryCard(7, "WMA", "Maków Mazowiecki", "MAZOWIECKIE");
        RegistryCard rC141 = new RegistryCard(7, "WML", "Mława", "MAZOWIECKIE");
        RegistryCard rC142 = new RegistryCard(7, "WO", "Ostrołęka", "MAZOWIECKIE");
        RegistryCard rC143 = new RegistryCard(7, "WOR", "Ostrów Mazowiecki", "MAZOWIECKIE");
        RegistryCard rC144 = new RegistryCard(7, "WPI", "Piaseczno", "MAZOWIECKIE");
        RegistryCard rC145 = new RegistryCard(7, "WPL", "Płock (Powiat)", "MAZOWIECKIE");
        RegistryCard rC146 = new RegistryCard(7, "WPR", "Pruszków", "MAZOWIECKIE");
        RegistryCard rC147 = new RegistryCard(7, "WPY", "Przysucha", "MAZOWIECKIE");
        RegistryCard rC148 = new RegistryCard(7, "WR", "Radom", "MAZOWIECKIE");
        RegistryCard rC149 = new RegistryCard(7, "WS", "Siedlce", "MAZOWIECKIE");
        RegistryCard rC150 = new RegistryCard(7, "WSE", "Sierpc", "MAZOWIECKIE");
        RegistryCard rC151 = new RegistryCard(7, "WSK", "Sokołów Podlaski", "MAZOWIECKIE");
        RegistryCard rC152 = new RegistryCard(7, "WZ", "Warszawa Zachodnia", "MAZOWIECKIE");
        RegistryCard rC153 = new RegistryCard(7, "WWL", "Wołomin", "MAZOWIECKIE");
        RegistryCard rC154 = new RegistryCard(7, "WZW", "Zwoleń", "MAZOWIECKIE");
        RegistryCard rC155 = new RegistryCard(7, "WZY", "Żyrardów", "MAZOWIECKIE");
        RegistryCard rC156 = new RegistryCard(7, "WCI", "Ciechanów", "MAZOWIECKIE");
        RegistryCard rC157 = new RegistryCard(7, "WGS", "Gostynin", "MAZOWIECKIE");
        RegistryCard rC158 = new RegistryCard(7, "WGR", "Grójec", "MAZOWIECKIE");
        RegistryCard rC159 = new RegistryCard(7, "WL", "Legionowo", "MAZOWIECKIE");
        RegistryCard rC160 = new RegistryCard(7, "WLS", "Łosice", "MAZOWIECKIE");
        RegistryCard rC161 = new RegistryCard(7, "WM", "Mińsk Mazowiecki", "MAZOWIECKIE");
        RegistryCard rC162 = new RegistryCard(7, "WND", "Nowy Dwór Mazowiecki", "MAZOWIECKIE");
        RegistryCard rC163 = new RegistryCard(7, "WOS", "Ostrołęka (Powiat)", "MAZOWIECKIE");
        RegistryCard rC164 = new RegistryCard(7, "WOT", "Otwock", "MAZOWIECKIE");
        RegistryCard rC165 = new RegistryCard(7, "WP", "Płock", "MAZOWIECKIE");
        RegistryCard rC166 = new RegistryCard(7, "WPN", "Płońsk", "MAZOWIECKIE");
        RegistryCard rC167 = new RegistryCard(7, "WPZ", "Przasnysz", "MAZOWIECKIE");
        RegistryCard rC168 = new RegistryCard(7, "WPU", "Pułtusk", "MAZOWIECKIE");
        RegistryCard rC169 = new RegistryCard(7, "WRA", "Radom (Powiat)", "MAZOWIECKIE");
        RegistryCard rC170 = new RegistryCard(7, "WSI", "Siedlce (Powiat)", "MAZOWIECKIE");
        RegistryCard rC171 = new RegistryCard(7, "WSC", "Sochaczew", "MAZOWIECKIE");
        RegistryCard rC172 = new RegistryCard(7, "WSZ", "Szydłowiec", "MAZOWIECKIE");
        RegistryCard rC173 = new RegistryCard(7, "WWE", "Węgrów", "MAZOWIECKIE");
        RegistryCard rC174 = new RegistryCard(7, "WWY", "Wyszków", "MAZOWIECKIE");
        RegistryCard rC175 = new RegistryCard(7, "WZU", "Żuromin", "MAZOWIECKIE");
        
        //opolskie
        RegistryCard rC176 = new RegistryCard(8, "OB", "Brzeg", "OPOLSKIE");
        RegistryCard rC177 = new RegistryCard(8, "OK", "Kędzierzyn Koźle", "OPOLSKIE");
        RegistryCard rC178 = new RegistryCard(8, "OKR", "Krąpkowice", "OPOLSKIE");
        RegistryCard rC179 = new RegistryCard(8, "ONY", "Nysa", "OPOLSKIE");
        RegistryCard rC180 = new RegistryCard(8, "OP", "Opole", "OPOLSKIE");
        RegistryCard rC181 = new RegistryCard(8, "OPR", "Prudnik", "OPOLSKIE");
        RegistryCard rC182 = new RegistryCard(8, "OGL", "Glubczyce", "OPOLSKIE");
        RegistryCard rC183 = new RegistryCard(8, "OKL", "Kluczbork", "OPOLSKIE");
        RegistryCard rC184 = new RegistryCard(8, "ONA", "Namysłów", "OPOLSKIE");
        RegistryCard rC185 = new RegistryCard(8, "OOL", "Olesko", "OPOLSKIE");
        RegistryCard rC186 = new RegistryCard(8, "OPO", "Opole (Powiat)", "OPOLSKIE");
        RegistryCard rC187 = new RegistryCard(8, "OST", "Strzelce Opolskie", "OPOLSKIE");
        
        //podkarpackie
        RegistryCard rC188 = new RegistryCard(9, "RBR", "Brzozów", "PODKARPACKIE");
        RegistryCard rC189 = new RegistryCard(9, "RJA", "Jarosław", "PODKARPACKIE");
        RegistryCard rC190 = new RegistryCard(9, "RKL", "Kolbuszowa", "PODKARPACKIE");
        RegistryCard rC191 = new RegistryCard(9, "RKR", "Krosno (Powiat)", "PODKARPACKIE");
        RegistryCard rC192 = new RegistryCard(9, "RLU", "Lubaczów", "PODKARPACKIE");
        RegistryCard rC193 = new RegistryCard(9, "RMI", "Mielec", "PODKARPACKIE");
        RegistryCard rC194 = new RegistryCard(9, "RP", "Przemyśl", "PODKARPACKIE");
        RegistryCard rC195 = new RegistryCard(9, "RPZ", "Przeworsk", "PODKARPACKIE");
        RegistryCard rC196 = new RegistryCard(9, "RZ", "Rzeszów", "PODKARPACKIE");
        RegistryCard rC197 = new RegistryCard(9, "RSA", "Sanok", "PODKARPACKIE");
        RegistryCard rC198 = new RegistryCard(9, "RSR", "Strzyżów", "PODKARPACKIE");
        RegistryCard rC199 = new RegistryCard(9, "RTA", "Tarnobrzeg (Powiat)", "PODKARPACKIE");
        RegistryCard rC200 = new RegistryCard(9, "RDE", "Dębica", "PODKARPACKIE");
        RegistryCard rC201 = new RegistryCard(9, "RJS", "Jasło", "PODKARPACKIE");
        RegistryCard rC202 = new RegistryCard(9, "RK", "Krosno", "PODKARPACKIE");
        RegistryCard rC203 = new RegistryCard(9, "RLE", "Leżajsk", "PODKARPACKIE");
        RegistryCard rC204 = new RegistryCard(9, "RLA", "Łańcut", "PODKARPACKIE");
        RegistryCard rC205 = new RegistryCard(9, "RNI", "Nisko", "PODKARPACKIE");
        RegistryCard rC206 = new RegistryCard(9, "RPR", "Przemyśl (Powiat)", "PODKARPACKIE");
        RegistryCard rC207 = new RegistryCard(9, "RRS", "Ropczyce", "PODKARPACKIE");
        RegistryCard rC208 = new RegistryCard(9, "RZE", "Rzeszów (Powiat)", "PODKARPACKIE");
        RegistryCard rC209 = new RegistryCard(9, "RST", "Stalowa Wola", "PODKARPACKIE");
        RegistryCard rC210 = new RegistryCard(9, "RT", "Tarnobrzeg", "PODKARPACKIE");
        RegistryCard rC211 = new RegistryCard(9, "RBI", "Ustrzyki Dolne", "PODKARPACKIE");
        
        //podlaskie
        RegistryCard rC212 = new RegistryCard(10, "BAU", "Augustów", "PODLASKIE");
        RegistryCard rC213 = new RegistryCard(10, "BIA", "Białystok (Powiat)", "PODLASKIE");
        RegistryCard rC214 = new RegistryCard(10, "BGR", "Grajewo", "PODLASKIE");
        RegistryCard rC215 = new RegistryCard(10, "BKL", "Kolno", "PODLASKIE");
        RegistryCard rC216 = new RegistryCard(10, "BLM", "Łomża (Powiat)", "PODLASKIE");
        RegistryCard rC217 = new RegistryCard(10, "BSE", "Sejny", "PODLASKIE");
        RegistryCard rC218 = new RegistryCard(10, "BSK", "Sokółka", "PODLASKIE");
        RegistryCard rC219 = new RegistryCard(10, "BSU", "Suwałki (Powiat)", "PODLASKIE");
        RegistryCard rC220 = new RegistryCard(10, "BZA", "Zambrów", "PODLASKIE");
        RegistryCard rC221 = new RegistryCard(10, "BI", "Białystok", "PODLASKIE");
        RegistryCard rC222 = new RegistryCard(10, "BBI", "Bielsk Podlaski", "PODLASKIE");
        RegistryCard rC223 = new RegistryCard(10, "BHA", "Hajnówka", "PODLASKIE");
        RegistryCard rC224 = new RegistryCard(10, "BL", "Łomża", "PODLASKIE");
        RegistryCard rC225 = new RegistryCard(10, "BMN", "Mońki", "PODLASKIE");
        RegistryCard rC226 = new RegistryCard(10, "BSI", "Siemiatycze", "PODLASKIE");
        RegistryCard rC227 = new RegistryCard(10, "BS", "Suwałki", "PODLASKIE");
        RegistryCard rC228 = new RegistryCard(10, "BWM", "Wysokie Mazowieckie", "PODLASKIE");
        
        //pomorskie
        RegistryCard rC229 = new RegistryCard(11, "GBY", "Bytów", "POMORSKIE");
        RegistryCard rC230 = new RegistryCard(11, "GCZ", "Człuchów", "POMORSKIE");
        //lost 231 but correct
        RegistryCard rC232 = new RegistryCard(11, "GA", "Gdynia", "POMORSKIE");
        RegistryCard rC233 = new RegistryCard(11, "GKS", "Kościerzyna", "POMORSKIE");
        RegistryCard rC234 = new RegistryCard(11, "GLE", "Lębork", "POMORSKIE");
        RegistryCard rC235 = new RegistryCard(11, "GND", "Nowy Dwór Gdański", "POMORSKIE");
        RegistryCard rC236 = new RegistryCard(11, "GPU", "Puck", "POMORSKIE");
        RegistryCard rC237 = new RegistryCard(11, "GSL", "Słupsk (Powiat)", "POMORSKIE");
        RegistryCard rC238 = new RegistryCard(11, "GST", "Starogard Gdański", "POMORSKIE");
        RegistryCard rC239 = new RegistryCard(11, "GWE", "Wejherowo", "POMORSKIE");
        RegistryCard rC240 = new RegistryCard(11, "GCH", "Chojnice", "POMORSKIE");
        RegistryCard rC241 = new RegistryCard(11, "GD", "Gdańsk", "POMORSKIE");
        RegistryCard rC242 = new RegistryCard(11, "GKA", "Kartuzy", "POMORSKIE");
        RegistryCard rC243 = new RegistryCard(11, "GKW", "Kwidzyn", "POMORSKIE");
        RegistryCard rC244 = new RegistryCard(11, "GMB", "Malbork", "POMORSKIE");
        RegistryCard rC245 = new RegistryCard(11, "GDA", "Pruszcz Gdański", "POMORSKIE");
        RegistryCard rC246 = new RegistryCard(11, "GS", "Słupsk", "POMORSKIE");
        RegistryCard rC247 = new RegistryCard(11, "GSP", "Sopot", "POMORSKIE");
        RegistryCard rC248 = new RegistryCard(11, "GTC", "Tczew", "POMORSKIE");
        
        //śląskie
        RegistryCard rC249 = new RegistryCard(12, "SBE", "Będzin", "ŚLĄSKIE");
        RegistryCard rC250 = new RegistryCard(12, "SBI", "Bielsko-Biała (Powiat)", "ŚLĄSKIE");
        RegistryCard rC251 = new RegistryCard(12, "SH", "Chorzów", "ŚLĄSKIE");
        RegistryCard rC252 = new RegistryCard(12, "SC", "Częstochowa", "ŚLĄSKIE");
        RegistryCard rC253 = new RegistryCard(12, "SD", "Dąbrowa Górnicza", "ŚLĄSKIE");
        RegistryCard rC254 = new RegistryCard(12, "SGL", "Gliwice (Powiat)", "ŚLĄSKIE");
        RegistryCard rC255 = new RegistryCard(12, "SJ", "Jaworzno", "ŚLĄSKIE");
        RegistryCard rC256 = new RegistryCard(12, "SKL", "Kłobuck", "ŚLĄSKIE");
        RegistryCard rC257 = new RegistryCard(12, "SMI", "Mikołów", "ŚLĄSKIE");
        RegistryCard rC258 = new RegistryCard(12, "SMY", "Myszków", "ŚLĄSKIE");
        RegistryCard rC259 = new RegistryCard(12, "SPS", "Pszczyna", "ŚLĄSKIE");
        RegistryCard rC260 = new RegistryCard(12, "SRS", "Ruda Śląska", "ŚLĄSKIE");
        RegistryCard rC261 = new RegistryCard(12, "SRB", "Rybnik (Powiat)", "ŚLĄSKIE");
        RegistryCard rC262 = new RegistryCard(12, "SO", "Sosnowiec", "ŚLĄSKIE");
        RegistryCard rC263 = new RegistryCard(12, "STA", "Tarnowskie Góry", "ŚLĄSKIE");
        RegistryCard rC264 = new RegistryCard(12, "STY", "Tychy (Powiat)", "ŚLĄSKIE");
        RegistryCard rC265 = new RegistryCard(12, "SZ", "Zabrze", "ŚLĄSKIE");
        RegistryCard rC266 = new RegistryCard(12, "SZO", "Żory", "ŚLĄSKIE");
        RegistryCard rC267 = new RegistryCard(12, "SB", "Bielsko-Biała", "ŚLĄSKIE");
        RegistryCard rC268 = new RegistryCard(12, "SY", "Bytom", "ŚLĄSKIE");
        RegistryCard rC269 = new RegistryCard(12, "SCI", "Cieszyn", "ŚLĄSKIE");
        RegistryCard rC270 = new RegistryCard(12, "SCZ", "Częstochowa (Powiat)", "ŚLĄSKIE");
        RegistryCard rC271 = new RegistryCard(12, "SG", "Gliwice", "ŚLĄSKIE");
        RegistryCard rC272 = new RegistryCard(12, "SJZ", "Jastrzębie Zdrój", "ŚLĄSKIE");
        RegistryCard rC273 = new RegistryCard(12, "SK", "Katowice", "ŚLĄSKIE");
        RegistryCard rC274 = new RegistryCard(12, "SLU", "Lubliniec", "ŚLĄSKIE");
        RegistryCard rC275 = new RegistryCard(12, "SM", "Mysłowice", "ŚLĄSKIE");
        RegistryCard rC276 = new RegistryCard(12, "SPI", "Piekary Śląskie", "ŚLĄSKIE");
        RegistryCard rC277 = new RegistryCard(12, "SRC", "Racibórz", "ŚLĄSKIE");
        RegistryCard rC278 = new RegistryCard(12, "SR", "Rybnik", "ŚLĄSKIE");
        RegistryCard rC279 = new RegistryCard(12, "SI", "Siemianowice Śląskie", "ŚLĄSKIE");
        RegistryCard rC280 = new RegistryCard(12, "SW", "Świętochłowice", "ŚLĄSKIE");
        RegistryCard rC281 = new RegistryCard(12, "ST", "Tychy", "ŚLĄSKIE");
        RegistryCard rC282 = new RegistryCard(12, "SWD", "Wodzisław Śląski", "ŚLĄSKIE");
        RegistryCard rC283 = new RegistryCard(12, "SZA", "Zawiercie", "ŚLĄSKIE");
        RegistryCard rC284 = new RegistryCard(12, "SZY", "Żywiec", "ŚLĄSKIE");
        
        //świętokrzyskie
        RegistryCard rC285 = new RegistryCard(13, "TBU", "Busko-Zdrój", "ŚWIĘTOKRZYSKIE");
        RegistryCard rC286 = new RegistryCard(13, "TKA", "Kazimierza Wielka", "ŚWIĘTOKRZYSKIE");
        RegistryCard rC287 = new RegistryCard(13, "TKI", "Kielce (Powiat)", "ŚWIĘTOKRZYSKIE");
        RegistryCard rC288 = new RegistryCard(13, "TOP", "Opatów", "ŚWIĘTOKRZYSKIE");
        RegistryCard rC289 = new RegistryCard(13, "TPI", "Pińczów", "ŚWIĘTOKRZYSKIE");
        RegistryCard rC290 = new RegistryCard(13, "TSK", "Skarrzysko Kamienna", "ŚWIĘTOKRZYSKIE");
        RegistryCard rC291 = new RegistryCard(13, "TSZ", "Staszów", "ŚWIĘTOKRZYSKIE");
        RegistryCard rC292 = new RegistryCard(13, "TJE", "Jędrzejów", "ŚWIĘTOKRZYSKIE");
        RegistryCard rC293 = new RegistryCard(13, "TK", "Kielce", "ŚWIĘTOKRZYSKIE");
        RegistryCard rC294 = new RegistryCard(13, "TKN", "Końskie", "ŚWIĘTOKRZYSKIE");
        RegistryCard rC295 = new RegistryCard(13, "TOS", "Ostrowiec Świętokrzyski", "ŚWIĘTOKRZYSKIE");
        RegistryCard rC296 = new RegistryCard(13, "TSA", "Sandomierz", "ŚWIĘTOKRZYSKIE");
        RegistryCard rC297 = new RegistryCard(13, "TST", "Starachowice", "ŚWIĘTOKRZYSKIE");
        RegistryCard rC298 = new RegistryCard(13, "TLW", "Włoszczowa", "ŚWIĘTOKRZYSKIE");
        
        //warmińsko-mazurskie
        RegistryCard rC299 = new RegistryCard(14, "NBA", "Bartoszyce", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC300 = new RegistryCard(14, "NDZ", "Działdowo", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC301 = new RegistryCard(14, "NEB", "Elbląg (Powiat)", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC302 = new RegistryCard(14, "NGI", "Giżycko", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC303 = new RegistryCard(14, "NKE", "Kętrzyn", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC304 = new RegistryCard(14, "NMR", "Mrągowo", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC305 = new RegistryCard(14, "NNM", "Nowe Miasto Lubawskie", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC306 = new RegistryCard(14, "NO", "Olsztyn", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC307 = new RegistryCard(14, "NOS", "Ostróda", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC308 = new RegistryCard(14, "NSZ", "Szczytno", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC309 = new RegistryCard(14, "NBR", "Braniewo", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC310 = new RegistryCard(14, "NE", "Elbląg", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC311 = new RegistryCard(14, "NEL", "Ełk", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC312 = new RegistryCard(14, "NIL", "Iława", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC313 = new RegistryCard(14, "NLI", "Lidzbark Warmiński", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC314 = new RegistryCard(14, "NNI", "Nidzica", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC315 = new RegistryCard(14, "NOG", "Olecko", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC316 = new RegistryCard(14, "NOL", "Olsztyn (Powiat)", "WARMIŃSKO-MAZURSKIE");
        RegistryCard rC317 = new RegistryCard(14, "NPI", "Pisz", "WARMIŃSKO-MAZURSKIE");
        
        //wielkopolskie
        RegistryCard rC318 = new RegistryCard(15, "PCH", "Chodzież", "WIELKOPOLSKIE");
        RegistryCard rC319 = new RegistryCard(15, "PGS", "Gostyń", "WIELKOPOLSKIE");
        RegistryCard rC320 = new RegistryCard(15, "PJA", "Jarocin", "WIELKOPOLSKIE");
        RegistryCard rC321 = new RegistryCard(15, "PKE", "Kępno", "WIELKOPOLSKIE");
        RegistryCard rC322 = new RegistryCard(15, "PKO", "Konin", "WIELKOPOLSKIE");
        RegistryCard rC323 = new RegistryCard(15, "PKR", "Krotoszyn", "WIELKOPOLSKIE");
        RegistryCard rC324 = new RegistryCard(15, "PLE", "Leszno (Powiat)", "WIELKOPOLSKIE");
        RegistryCard rC325 = new RegistryCard(15, "PNT", "Nowy Tomyśl", "WIELKOPOLSKIE");
        RegistryCard rC326 = new RegistryCard(15, "POS", "Ostrów Wielkopolski", "WIELKOPOLSKIE");
        RegistryCard rC327 = new RegistryCard(15, "PP", "Piła", "WIELKOPOLSKIE");
        RegistryCard rC328 = new RegistryCard(15, "PCT", "Powiat Czarnkowsko-Trzcianecki", "WIELKOPOLSKIE");
        RegistryCard rC329 = new RegistryCard(15, "POZ", "Poznań (Powiat)", "WIELKOPOLSKIE");
        RegistryCard rC330 = new RegistryCard(15, "PSL", "Słupca", "WIELKOPOLSKIE");
        RegistryCard rC331 = new RegistryCard(15, "PSE", "Śrem", "WIELKOPOLSKIE");
        RegistryCard rC332 = new RegistryCard(15, "PTU", "Turek", "WIELKOPOLSKIE");
        RegistryCard rC333 = new RegistryCard(15, "PWL", "Wolsztyn", "WIELKOPOLSKIE");
        RegistryCard rC334 = new RegistryCard(15, "PZL", "Zlotów", "WIELKOPOLSKIE");
        RegistryCard rC335 = new RegistryCard(15, "PGN", "Gniezno", "WIELKOPOLSKIE");
        RegistryCard rC336 = new RegistryCard(15, "PGO", "Grodzisk Wielkopolski", "WIELKOPOLSKIE");
        RegistryCard rC337 = new RegistryCard(15, "PKA", "Kalisz", "WIELKOPOLSKIE");
        RegistryCard rC338 = new RegistryCard(15, "PKL", "Koło", "WIELKOPOLSKIE");
        RegistryCard rC339 = new RegistryCard(15, "PKS", "Kościan", "WIELKOPOLSKIE");
        RegistryCard rC340 = new RegistryCard(15, "PL", "Leszno", "WIELKOPOLSKIE");
        RegistryCard rC341 = new RegistryCard(15, "PMI", "Międzychód", "WIELKOPOLSKIE");
        RegistryCard rC342 = new RegistryCard(15, "POB", "Oborniki", "WIELKOPOLSKIE");
        RegistryCard rC343 = new RegistryCard(15, "POT", "Ostrzeszów", "WIELKOPOLSKIE");
        RegistryCard rC344 = new RegistryCard(15, "PPL", "Pleszew", "WIELKOPOLSKIE");
        RegistryCard rC345 = new RegistryCard(15, "PO", "Poznań", "WIELKOPOLSKIE");
        RegistryCard rC346 = new RegistryCard(15, "PRA", "Rawicz", "WIELKOPOLSKIE");
        RegistryCard rC347 = new RegistryCard(15, "PSZ", "Szamotuły", "WIELKOPOLSKIE");
        RegistryCard rC348 = new RegistryCard(15, "PSR", "Środa Wielkopolska", "WIELKOPOLSKIE");
        RegistryCard rC349 = new RegistryCard(15, "PWA", "Wągrowiec", "WIELKOPOLSKIE");
        RegistryCard rC350 = new RegistryCard(15, "PWR", "Września", "WIELKOPOLSKIE");
        
        //zachodnio-pomorskie
        RegistryCard rC351 = new RegistryCard(16, "ZBI", "Białogard", "ZACHODNIOPOMORSKIE");
        RegistryCard rC352 = new RegistryCard(16, "ZDR", "Drawsko Pomorskie", "ZACHODNIOPOMORSKIE");
        RegistryCard rC353 = new RegistryCard(16, "ZGY", "Gryfice", "ZACHODNIOPOMORSKIE");
        RegistryCard rC354 = new RegistryCard(16, "ZKA", "Kamień Pomorski", "ZACHODNIOPOMORSKIE");
        RegistryCard rC355 = new RegistryCard(16, "ZK", "Koszalin", "ZACHODNIOPOMORSKIE");
        RegistryCard rC356 = new RegistryCard(16, "ZMY", "Myślibórz", "ZACHODNIOPOMORSKIE");
        RegistryCard rC357 = new RegistryCard(16, "ZPY", "Pyrzyce", "ZACHODNIOPOMORSKIE");
        RegistryCard rC358 = new RegistryCard(16, "ZST", "Stargard Szczeciński", "ZACHODNIOPOMORSKIE");
        RegistryCard rC359 = new RegistryCard(16, "ZSZ", "Szczecinek", "ZACHODNIOPOMORSKIE");
        RegistryCard rC360 = new RegistryCard(16, "ZSW", "Świnoujście", "ZACHODNIOPOMORSKIE");
        RegistryCard rC361 = new RegistryCard(16, "ZCH", "Choszczno", "ZACHODNIOPOMORSKIE");
        RegistryCard rC362 = new RegistryCard(16, "ZGL", "Goleniów", "ZACHODNIOPOMORSKIE");
        RegistryCard rC363 = new RegistryCard(16, "ZGR", "Gryfino", "ZACHODNIOPOMORSKIE");
        RegistryCard rC364 = new RegistryCard(16, "ZKL", "Kołobrzeg", "ZACHODNIOPOMORSKIE");
        RegistryCard rC365 = new RegistryCard(16, "ZKO", "Koszalin (Powiat)", "ZACHODNIOPOMORSKIE");
        RegistryCard rC366 = new RegistryCard(16, "ZPL", "Police", "ZACHODNIOPOMORSKIE");
        RegistryCard rC367 = new RegistryCard(16, "ZSL", "Sławno", "ZACHODNIOPOMORSKIE");
        RegistryCard rC368 = new RegistryCard(16, "ZS", "Szczecin", "ZACHODNIOPOMORSKIE");
        RegistryCard rC369 = new RegistryCard(16, "ZSD", "Świdwin", "ZACHODNIOPOMORSKIE");
        RegistryCard rC370 = new RegistryCard(16, "ZWA", "Wałcz", "ZACHODNIOPOMORSKIE");
        
        
        
        
        //adding to list all registryCards
        registryCardList.add(rC001);
        registryCardList.add(rC002);
        registryCardList.add(rC003);
        registryCardList.add(rC004);
        registryCardList.add(rC005);
        registryCardList.add(rC006);
        registryCardList.add(rC007);
        registryCardList.add(rC008);
        registryCardList.add(rC009);
        registryCardList.add(rC010);
        registryCardList.add(rC011);
        registryCardList.add(rC012);
        registryCardList.add(rC013);
        registryCardList.add(rC014);
        registryCardList.add(rC015);
        registryCardList.add(rC016);
        registryCardList.add(rC017);
        registryCardList.add(rC018);
        registryCardList.add(rC0185); //missed it
        registryCardList.add(rC019);
        registryCardList.add(rC020);
        registryCardList.add(rC021);
        registryCardList.add(rC022);
        registryCardList.add(rC023);
        registryCardList.add(rC024);
        registryCardList.add(rC025);
        registryCardList.add(rC026);
        registryCardList.add(rC027);
        registryCardList.add(rC028);
        registryCardList.add(rC029);
        registryCardList.add(rC030);
        registryCardList.add(rC031);
        registryCardList.add(rC032);
        registryCardList.add(rC033);
        registryCardList.add(rC034);
        registryCardList.add(rC035);
        registryCardList.add(rC036);
        registryCardList.add(rC037);
        registryCardList.add(rC038);
        registryCardList.add(rC039);
        registryCardList.add(rC040);
        registryCardList.add(rC041);
        registryCardList.add(rC042);
        registryCardList.add(rC043);
        registryCardList.add(rC044);
        registryCardList.add(rC045);
        registryCardList.add(rC046);
        registryCardList.add(rC047);
        registryCardList.add(rC048);
        registryCardList.add(rC049);
        registryCardList.add(rC050);
        registryCardList.add(rC051);
        registryCardList.add(rC052);
        registryCardList.add(rC053);
        registryCardList.add(rC054);
        registryCardList.add(rC055);
        registryCardList.add(rC056);
        registryCardList.add(rC057);
        registryCardList.add(rC058);
        registryCardList.add(rC059);
        registryCardList.add(rC060);
        registryCardList.add(rC061);
        registryCardList.add(rC062);
        registryCardList.add(rC063);
        registryCardList.add(rC064);
        registryCardList.add(rC065);
        registryCardList.add(rC066);
        registryCardList.add(rC067);
        registryCardList.add(rC068);
        registryCardList.add(rC069);
        registryCardList.add(rC070);
        registryCardList.add(rC071);
        registryCardList.add(rC072);
        registryCardList.add(rC073);
        registryCardList.add(rC074);
        registryCardList.add(rC075);
        registryCardList.add(rC076);
        registryCardList.add(rC077);
        registryCardList.add(rC078);
        registryCardList.add(rC079);
        registryCardList.add(rC080);
        registryCardList.add(rC081);
        registryCardList.add(rC082);
        registryCardList.add(rC083);
        registryCardList.add(rC084);
        registryCardList.add(rC085);
        registryCardList.add(rC086);
        registryCardList.add(rC087);
        registryCardList.add(rC088);
        registryCardList.add(rC089);
        registryCardList.add(rC090);
        registryCardList.add(rC091);
        registryCardList.add(rC092);
        registryCardList.add(rC093);
        registryCardList.add(rC094);
        registryCardList.add(rC095);
        registryCardList.add(rC096);
        registryCardList.add(rC097);
        registryCardList.add(rC098);
        registryCardList.add(rC099);
        registryCardList.add(rC100);
        registryCardList.add(rC101);
        registryCardList.add(rC102);
        registryCardList.add(rC103);
        registryCardList.add(rC104);
        registryCardList.add(rC105);
        registryCardList.add(rC106);
        registryCardList.add(rC107);
        registryCardList.add(rC108);
        registryCardList.add(rC109);
        registryCardList.add(rC110);
        registryCardList.add(rC111);
        registryCardList.add(rC112);
        registryCardList.add(rC113);
        registryCardList.add(rC114);
        registryCardList.add(rC115);
        registryCardList.add(rC116);
        registryCardList.add(rC117);
        registryCardList.add(rC118);
        registryCardList.add(rC119);
        registryCardList.add(rC120);
        registryCardList.add(rC121);
        registryCardList.add(rC122);
        registryCardList.add(rC123);
        registryCardList.add(rC124);
        registryCardList.add(rC125);
        registryCardList.add(rC126);
        registryCardList.add(rC127);
        registryCardList.add(rC128);
        registryCardList.add(rC129);
        registryCardList.add(rC130);
        registryCardList.add(rC131);
        registryCardList.add(rC132);
        registryCardList.add(rC133);
        registryCardList.add(rC134);
        registryCardList.add(rC135);
        registryCardList.add(rC136);
        registryCardList.add(rC137);
        registryCardList.add(rC138);
        registryCardList.add(rC139);
        registryCardList.add(rC140);
        registryCardList.add(rC141);
        registryCardList.add(rC142);
        registryCardList.add(rC143);
        registryCardList.add(rC144);
        registryCardList.add(rC145);
        registryCardList.add(rC146);
        registryCardList.add(rC147);
        registryCardList.add(rC148);
        registryCardList.add(rC149);
        registryCardList.add(rC150);
        registryCardList.add(rC151);
        registryCardList.add(rC152);
        registryCardList.add(rC153);
        registryCardList.add(rC154);
        registryCardList.add(rC155);
        registryCardList.add(rC156);
        registryCardList.add(rC157);
        registryCardList.add(rC158);
        registryCardList.add(rC159);
        registryCardList.add(rC160);
        registryCardList.add(rC161);
        registryCardList.add(rC162);
        registryCardList.add(rC163);
        registryCardList.add(rC164);
        registryCardList.add(rC165);
        registryCardList.add(rC166);
        registryCardList.add(rC167);
        registryCardList.add(rC168);
        registryCardList.add(rC169);
        registryCardList.add(rC170);
        registryCardList.add(rC171);
        registryCardList.add(rC172);
        registryCardList.add(rC173);
        registryCardList.add(rC174);
        registryCardList.add(rC175);
        registryCardList.add(rC176);
        registryCardList.add(rC177);
        registryCardList.add(rC178);
        registryCardList.add(rC179);
        registryCardList.add(rC180);
        registryCardList.add(rC181);
        registryCardList.add(rC182);
        registryCardList.add(rC183);
        registryCardList.add(rC184);
        registryCardList.add(rC185);
        registryCardList.add(rC186);
        registryCardList.add(rC187);
        registryCardList.add(rC188);
        registryCardList.add(rC189);
        registryCardList.add(rC190);
        registryCardList.add(rC191);
        registryCardList.add(rC192);
        registryCardList.add(rC193);
        registryCardList.add(rC194);
        registryCardList.add(rC195);
        registryCardList.add(rC196);
        registryCardList.add(rC197);
        registryCardList.add(rC198);
        registryCardList.add(rC199);
        registryCardList.add(rC200);
        registryCardList.add(rC201);
        registryCardList.add(rC202);
        registryCardList.add(rC203);
        registryCardList.add(rC204);
        registryCardList.add(rC205);
        registryCardList.add(rC206);
        registryCardList.add(rC207);
        registryCardList.add(rC208);
        registryCardList.add(rC209);
        registryCardList.add(rC210);
        registryCardList.add(rC211);
        registryCardList.add(rC212);
        registryCardList.add(rC213);
        registryCardList.add(rC214);
        registryCardList.add(rC215);
        registryCardList.add(rC216);
        registryCardList.add(rC217);
        registryCardList.add(rC218);
        registryCardList.add(rC219);
        registryCardList.add(rC220);
        registryCardList.add(rC221);
        registryCardList.add(rC222);
        registryCardList.add(rC223);
        registryCardList.add(rC224);
        registryCardList.add(rC225);
        registryCardList.add(rC226);
        registryCardList.add(rC227);
        registryCardList.add(rC228);
        registryCardList.add(rC229);
        registryCardList.add(rC230);
        //lost 231 but correct
        registryCardList.add(rC232);
        registryCardList.add(rC233);
        registryCardList.add(rC234);
        registryCardList.add(rC235);
        registryCardList.add(rC236);
        registryCardList.add(rC237);
        registryCardList.add(rC238);
        registryCardList.add(rC239);
        registryCardList.add(rC240);
        registryCardList.add(rC241);
        registryCardList.add(rC242);
        registryCardList.add(rC243);
        registryCardList.add(rC244);
        registryCardList.add(rC245);
        registryCardList.add(rC246);
        registryCardList.add(rC247);
        registryCardList.add(rC248);
        registryCardList.add(rC249);
        registryCardList.add(rC250);
        registryCardList.add(rC251);
        registryCardList.add(rC252);
        registryCardList.add(rC253);
        registryCardList.add(rC254);
        registryCardList.add(rC255);
        registryCardList.add(rC256);
        registryCardList.add(rC257);
        registryCardList.add(rC258);
        registryCardList.add(rC259);
        registryCardList.add(rC260);
        registryCardList.add(rC261);
        registryCardList.add(rC262);
        registryCardList.add(rC263);
        registryCardList.add(rC264);
        registryCardList.add(rC265);
        registryCardList.add(rC266);
        registryCardList.add(rC267);
        registryCardList.add(rC268);
        registryCardList.add(rC269);
        registryCardList.add(rC270);
        registryCardList.add(rC271);
        registryCardList.add(rC272);
        registryCardList.add(rC273);
        registryCardList.add(rC274);
        registryCardList.add(rC275);
        registryCardList.add(rC276);
        registryCardList.add(rC277);
        registryCardList.add(rC278);
        registryCardList.add(rC279);
        registryCardList.add(rC280);
        registryCardList.add(rC281);
        registryCardList.add(rC282);
        registryCardList.add(rC283);
        registryCardList.add(rC284);
        registryCardList.add(rC285);
        registryCardList.add(rC286);
        registryCardList.add(rC287);
        registryCardList.add(rC288);
        registryCardList.add(rC289);
        registryCardList.add(rC290);
        registryCardList.add(rC291);
        registryCardList.add(rC292);
        registryCardList.add(rC293);
        registryCardList.add(rC294);
        registryCardList.add(rC295);
        registryCardList.add(rC296);
        registryCardList.add(rC297);
        registryCardList.add(rC298);
        registryCardList.add(rC299);
        registryCardList.add(rC300);
        registryCardList.add(rC301);
        registryCardList.add(rC302);
        registryCardList.add(rC303);
        registryCardList.add(rC304);
        registryCardList.add(rC305);
        registryCardList.add(rC306);
        registryCardList.add(rC307);
        registryCardList.add(rC308);
        registryCardList.add(rC309);
        registryCardList.add(rC310);
        registryCardList.add(rC311);
        registryCardList.add(rC312);
        registryCardList.add(rC313);
        registryCardList.add(rC314);
        registryCardList.add(rC315);
        registryCardList.add(rC316);
        registryCardList.add(rC317);
        registryCardList.add(rC318);
        registryCardList.add(rC319);
        registryCardList.add(rC320);
        registryCardList.add(rC321);
        registryCardList.add(rC322);
        registryCardList.add(rC323);
        registryCardList.add(rC324);
        registryCardList.add(rC325);
        registryCardList.add(rC326);
        registryCardList.add(rC327);
        registryCardList.add(rC328);
        registryCardList.add(rC329);
        registryCardList.add(rC330);
        registryCardList.add(rC331);
        registryCardList.add(rC332);
        registryCardList.add(rC333);
        registryCardList.add(rC334);
        registryCardList.add(rC335);
        registryCardList.add(rC336);
        registryCardList.add(rC337);
        registryCardList.add(rC338);
        registryCardList.add(rC339);
        registryCardList.add(rC340);
        registryCardList.add(rC341);
        registryCardList.add(rC342);
        registryCardList.add(rC343);
        registryCardList.add(rC344);
        registryCardList.add(rC345);
        registryCardList.add(rC346);
        registryCardList.add(rC347);
        registryCardList.add(rC348);
        registryCardList.add(rC349);
        registryCardList.add(rC350);
        registryCardList.add(rC351);
        registryCardList.add(rC352);
        registryCardList.add(rC353);
        registryCardList.add(rC354);
        registryCardList.add(rC355);
        registryCardList.add(rC356);
        registryCardList.add(rC357);
        registryCardList.add(rC358);
        registryCardList.add(rC359);
        registryCardList.add(rC360);
        registryCardList.add(rC361);
        registryCardList.add(rC362);
        registryCardList.add(rC363);
        registryCardList.add(rC364);
        registryCardList.add(rC365);
        registryCardList.add(rC366);
        registryCardList.add(rC367);
        registryCardList.add(rC368);
        registryCardList.add(rC369);
        registryCardList.add(rC370);
        
        
        
        
        //adding to specific lists
        for(RegistryCard rC : registryCardList){
            int currentProvinceNumber = rC.getProvinceNumber();
            switch (currentProvinceNumber){
                case 1: dolnoslaskieCardList.add(rC);
                break;
                case 2: kujawskoPomorskieCardList.add(rC);
                break;
                case 3: lubelskieCardList.add(rC);
                break;
                case 4: lubuskieCardList.add(rC);
                break;
                case 5: lodzkieCardList.add(rC);
                break;
                case 6: malopolskieCardList.add(rC);
                break;
                case 7: mazowieckieCardList.add(rC);
                break;
                case 8: opolskieCardList.add(rC);
                break;
                case 9: podkarpackieCardList.add(rC);
                break;
                case 10: podlaskieCardList.add(rC);
                break;
                case 11: pomorskieCardList.add(rC);
                break;
                case 12: slaskieCardList.add(rC);
                break;
                case 13: swietokrzyskieCardList.add(rC);
                break;
                case 14: warminskoMazurskieCardList.add(rC);
                break;
                case 15: wielkopolskieCardList.add(rC);
                break;
                case 16: zachodnioPomorskieCardList.add(rC);
                break;
            }
        }
    }

    
    
    
    
    
    
    //getters and setters
    
    /**
     * @return the registryCardList
     */
    public List<RegistryCard> getRegistryCardList() {
        return registryCardList;
    }

    /**
     * @param registryCardList the registryCardList to set
     */
    public void setRegistryCardList(List<RegistryCard> registryCardList) {
        this.registryCardList = registryCardList;
    }

    /**
     * @return the dolnoslaskieCardList
     */
    public List<RegistryCard> getDolnoslaskieCardList() {
        return dolnoslaskieCardList;
    }

    /**
     * @param dolnoslaskieCardList the dolnoslaskieCardList to set
     */
    public void setDolnoslaskieCardList(List<RegistryCard> dolnoslaskieCardList) {
        this.dolnoslaskieCardList = dolnoslaskieCardList;
    }

    /**
     * @return the kujawskoPomorskieCardList
     */
    public List<RegistryCard> getKujawskoPomorskieCardList() {
        return kujawskoPomorskieCardList;
    }

    /**
     * @param kujawskoPomorskieCardList the kujawskoPomorskieCardList to set
     */
    public void setKujawskoPomorskieCardList(List<RegistryCard> kujawskoPomorskieCardList) {
        this.kujawskoPomorskieCardList = kujawskoPomorskieCardList;
    }

    /**
     * @return the lubelskieCardList
     */
    public List<RegistryCard> getLubelskieCardList() {
        return lubelskieCardList;
    }

    /**
     * @param lubelskieCardList the lubelskieCardList to set
     */
    public void setLubelskieCardList(List<RegistryCard> lubelskieCardList) {
        this.lubelskieCardList = lubelskieCardList;
    }

    /**
     * @return the lubuskieCardList
     */
    public List<RegistryCard> getLubuskieCardList() {
        return lubuskieCardList;
    }

    /**
     * @param lubuskieCardList the lubuskieCardList to set
     */
    public void setLubuskieCardList(List<RegistryCard> lubuskieCardList) {
        this.lubuskieCardList = lubuskieCardList;
    }

    /**
     * @return the lodzkieCardList
     */
    public List<RegistryCard> getLodzkieCardList() {
        return lodzkieCardList;
    }

    /**
     * @param lodzkieCardList the lodzkieCardList to set
     */
    public void setLodzkieCardList(List<RegistryCard> lodzkieCardList) {
        this.lodzkieCardList = lodzkieCardList;
    }

    /**
     * @return the malopolskieCardList
     */
    public List<RegistryCard> getMalopolskieCardList() {
        return malopolskieCardList;
    }

    /**
     * @param malopolskieCardList the malopolskieCardList to set
     */
    public void setMalopolskieCardList(List<RegistryCard> malopolskieCardList) {
        this.malopolskieCardList = malopolskieCardList;
    }

    /**
     * @return the mazowieckieCardList
     */
    public List<RegistryCard> getMazowieckieCardList() {
        return mazowieckieCardList;
    }

    /**
     * @param mazowieckieCardList the mazowieckieCardList to set
     */
    public void setMazowieckieCardList(List<RegistryCard> mazowieckieCardList) {
        this.mazowieckieCardList = mazowieckieCardList;
    }

    /**
     * @return the opolskieCardList
     */
    public List<RegistryCard> getOpolskieCardList() {
        return opolskieCardList;
    }

    /**
     * @param opolskieCardList the opolskieCardList to set
     */
    public void setOpolskieCardList(List<RegistryCard> opolskieCardList) {
        this.opolskieCardList = opolskieCardList;
    }

    /**
     * @return the podkarpackieCardList
     */
    public List<RegistryCard> getPodkarpackieCardList() {
        return podkarpackieCardList;
    }

    /**
     * @param podkarpackieCardList the podkarpackieCardList to set
     */
    public void setPodkarpackieCardList(List<RegistryCard> podkarpackieCardList) {
        this.podkarpackieCardList = podkarpackieCardList;
    }

    /**
     * @return the podlaskieCardList
     */
    public List<RegistryCard> getPodlaskieCardList() {
        return podlaskieCardList;
    }

    /**
     * @param podlaskieCardList the podlaskieCardList to set
     */
    public void setPodlaskieCardList(List<RegistryCard> podlaskieCardList) {
        this.podlaskieCardList = podlaskieCardList;
    }

    /**
     * @return the pomorskieCardList
     */
    public List<RegistryCard> getPomorskieCardList() {
        return pomorskieCardList;
    }

    /**
     * @param pomorskieCardList the pomorskieCardList to set
     */
    public void setPomorskieCardList(List<RegistryCard> pomorskieCardList) {
        this.pomorskieCardList = pomorskieCardList;
    }

    /**
     * @return the slaskieCardList
     */
    public List<RegistryCard> getSlaskieCardList() {
        return slaskieCardList;
    }

    /**
     * @param slaskieCardList the slaskieCardList to set
     */
    public void setSlaskieCardList(List<RegistryCard> slaskieCardList) {
        this.slaskieCardList = slaskieCardList;
    }

    /**
     * @return the swietokrzyskieCardList
     */
    public List<RegistryCard> getSwietokrzyskieCardList() {
        return swietokrzyskieCardList;
    }

    /**
     * @param swietokrzyskieCardList the swietokrzyskieCardList to set
     */
    public void setSwietokrzyskieCardList(List<RegistryCard> swietokrzyskieCardList) {
        this.swietokrzyskieCardList = swietokrzyskieCardList;
    }

    /**
     * @return the warminskoMazurskieCardList
     */
    public List<RegistryCard> getWarminskoMazurskieCardList() {
        return warminskoMazurskieCardList;
    }

    /**
     * @param warminskoMazurskieCardList the warminskoMazurskieCardList to set
     */
    public void setWarminskoMazurskieCardList(List<RegistryCard> warminskoMazurskieCardList) {
        this.warminskoMazurskieCardList = warminskoMazurskieCardList;
    }

    /**
     * @return the wielkopolskieCardList
     */
    public List<RegistryCard> getWielkopolskieCardList() {
        return wielkopolskieCardList;
    }

    /**
     * @param wielkopolskieCardList the wielkopolskieCardList to set
     */
    public void setWielkopolskieCardList(List<RegistryCard> wielkopolskieCardList) {
        this.wielkopolskieCardList = wielkopolskieCardList;
    }

    /**
     * @return the zachodnioPomorskieCardList
     */
    public List<RegistryCard> getZachodnioPomorskieCardList() {
        return zachodnioPomorskieCardList;
    }

    /**
     * @param zachodnioPomorskieCardList the zachodnioPomorskieCardList to set
     */
    public void setZachodnioPomorskieCardList(List<RegistryCard> zachodnioPomorskieCardList) {
        this.zachodnioPomorskieCardList = zachodnioPomorskieCardList;
    }
}
