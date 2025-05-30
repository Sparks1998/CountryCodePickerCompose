package com.rejowan.ccpc

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

enum class Country(
    val countryIso : String ,
    val countryName : String ,
    val countryCode : String ,
    val localCountryCodes : Array<String> = arrayOf()
) {
    Andorra("AD" , "Andorra" , "+376") ,
    UnitedArabEmirates("AE" , "United Arab Emirates" , "+971") ,
    Afghanistan("AF" , "Afghanistan" , "+93") ,
    AntiguaAndBarbuda("AG" , "Antigua and Barbuda" , "+1" , arrayOf("+1268")) ,
    Anguilla("AI" , "Anguilla" , "+1" , arrayOf("+1264")) ,
    Albania("AL" , "Albania" , "+355") ,
    Armenia("AM" , "Armenia" , "+374") ,
    Angola("AO" , "Angola" , "+244") ,
    Antarctica("AQ" , "Antarctica" , "+672" , arrayOf("+6721")) ,
    Argentina("AR" , "Argentina" , "+54") ,
    AmericanSamoa("AS" , "American Samoa" , "+1" , arrayOf("+1684")) ,
    Austria("AT" , "Austria" , "+43") ,
    Australia("AU" , "Australia" , "+61") ,
    Aruba("AW" , "Aruba" , "+297") ,
    AlandIslands("AX" , "Aland Islands" , "+358" , arrayOf("+35818")) ,
    Azerbaijan("AZ" , "Azerbaijan" , "+994") ,
    BosniaAndHerzegovina("BA" , "Bosnia and Herzegovina" , "+387") ,
    Barbados("BB" , "Barbados" , "+1" , arrayOf("+1246")) ,
    Bangladesh("BD" , "Bangladesh" , "+880") ,
    Belgium("BE" , "Belgium" , "+32") ,
    BurkinaFaso("BF" , "Burkina Faso" , "+226") ,
    Bulgaria("BG" , "Bulgaria" , "+359") ,
    Bahrain("BH" , "Bahrain" , "+973") ,
    Burundi("BI" , "Burundi" , "+257") ,
    Benin("BJ" , "Benin" , "+229") ,
    SaintBarthelemy("BL" , "Saint Barthélemy" , "+590") ,
    Bermuda("BM" , "Bermuda" , "+1" , arrayOf("+1441")) ,
    BruneiDarussalam("BN" , "Brunei Darussalam" , "+673") ,
    Bolivia("BO" , "Bolivia" , "+591") ,
    Brazil("BR" , "Brazil" , "+55") ,
    Bahamas("BS" , "Bahamas" , "+1" , arrayOf("+1242")) ,
    Bhutan("BT" , "Bhutan" , "+975") ,
    Botswana("BW" , "Botswana" , "+267") ,
    Belarus("BY" , "Belarus" , "+375") ,
    Belize("BZ" , "Belize" , "+501") ,
    Canada("CA" ,
        "Canada" ,
        "+1" ,
        arrayOf("+1204" ,
            "+1226" ,
            "+1236" ,
            "+1249" ,
            "+1250" ,
            "+1289" ,
            "+1306" ,
            "+1343" ,
            "+1365" ,
            "+1367" ,
            "+1368" ,
            "+1403" ,
            "+1416" ,
            "+1418" ,
            "+1431" ,
            "+1437" ,
            "+1438" ,
            "+1450" ,
            "+1506" ,
            "+1514" ,
            "+1519" ,
            "+1548" ,
            "+1579" ,
            "+1581" ,
            "+1587" ,
            "+1604" ,
            "+1613" ,
            "+1639" ,
            "+1647" ,
            "+1672" ,
            "+1705" ,
            "+1709" ,
            "+1778" ,
            "+1780" ,
            "+1782" ,
            "+1807" ,
            "+1819" ,
            "+1825" ,
            "+1867" ,
            "+1873" ,
            "+1902" ,
            "+1905")) ,
    CocosKeelingIslands("CC" , "Cocos (Keeling) Islands" , "+61" , arrayOf("+618")) ,
    CongoKinshasaDRC("CD" , "Democratic Republic Of The Congo" , "+243") ,
    CentralAfricanRepublic("CF" , "Central African Republic" , "+236") ,
    CongoBrazzavilleRepublic("CG" , "Congo Republic" , "+242") ,
    Switzerland("CH" , "Switzerland" , "+41") ,
    CoteDivoire("CI" , "Côte D'Ivoire" , "+225") ,
    CookIslands("CK" , "Cook Islands" , "+682") ,
    Chile("CL" , "Chile" , "+56") ,
    Cameroon("CM" , "Cameroon" , "+237") ,
    China("CN" , "China" , "+86") ,
    Colombia("CO" , "Colombia" , "+57") ,
    CostaRica("CR" , "Costa Rica" , "+506") ,
    Cuba("CU" , "Cuba" , "+53") ,
    CapeVerde("CV" , "Cape Verde" , "+238") ,
    Curacao("CW" , "Curaçao" , "+599") ,
    Christmas("CX" , "Christmas Island" , "+61" , arrayOf("+6189164")) ,
    CyprusIsland("CY" , "Cyprus" , "+357") ,
    CzechRepublic("CZ" , "Czech Republic" , "+420") ,
    Germany("DE" , "Germany" , "+49") ,
    Djibouti("DJ" , "Djibouti" , "+253") ,
    Denmark("DK" , "Denmark" , "+45") ,
    Dominica("DM" , "Dominica" , "+1" , arrayOf("+1767")) ,
    DominicanRepublic("DO" , "Dominican Republic" , "+1" , arrayOf("+1809" , "+1829" , "+1849")) ,
    Algeria("DZ" , "Algeria" , "+213") ,
    Ecuador("EC" , "Ecuador" , "+593") ,
    Estonia("EE" , "Estonia" , "+372") ,
    Egypt("EG" , "Egypt" , "+20") ,
    Eritrea("ER" , "Eritrea" , "+291") ,
    Spain("ES" , "Spain" , "+34") ,
    Ethiopia("ET" , "Ethiopia" , "+251") ,
    Finland("FI" , "Finland" , "+358" , arrayOf("+358")) ,
    Fiji("FJ" , "Fiji" , "+679") ,
    FalklandIslands("FK" , "Falkland Islands (Malvinas)" , "+500") ,
    Micronesia("FM" , "Micronesia" , "+691") ,
    FaroeIslands("FO" , "Faroe Islands" , "+298") ,
    France("FR" , "France" , "+33") ,
    Gabon("GA" , "Gabon" , "+241") ,
    UnitedKingdom("GB" , "United Kingdom" , "+44" , arrayOf("+44")) ,
    Grenada("GD" , "Grenada" , "+1" , arrayOf("+1473")) ,
    Georgia("GE" , "Georgia" , "+995") ,
    FrenchGuyana("GF" , "French Guyana" , "+594") ,
    Ghana("GH" , "Ghana" , "+233") ,
    Gibraltar("GI" , "Gibraltar" , "+350") ,
    Greenland("GL" , "Greenland" , "+299") ,
    Gambia("GM" , "Gambia" , "+220") ,
    Guinea("GN" , "Guinea" , "+224") ,
    Guadeloupe("GP" , "Guadeloupe" , "+590") ,
    EquatorialGuinea("GQ" , "Equatorial Guinea" , "+240") ,
    Greece("GR" , "Greece" , "+30") ,
    Guatemala("GT" , "Guatemala" , "+502") ,
    Guam("GU" , "Guam" , "+1" , arrayOf("+1671")) ,
    GuineaBissau("GW" , "Guinea-bissau" , "+245") ,
    Guyana("GY" , "Guyana" , "+592") ,
    HongKong("HK" , "Hong Kong" , "+852") ,
    Honduras("HN" , "Honduras" , "+504") ,
    Croatia("HR" , "Croatia" , "+385") ,
    Haiti("HT" , "Haiti" , "+509") ,
    Hungary("HU" , "Hungary" , "+36") ,
    Indonesia("ID" , "Indonesia" , "+62") ,
    Ireland("IE" , "Ireland" , "+353") ,
    Israel("IL" , "Israel" , "+972") ,
    IsleOfMan("IM" , "Isle Of Man" , "+44" , arrayOf("+441624")) ,
    India("IN" , "India" , "+91") ,
    BritishIndianOceanTerritory("IO" , "British Indian Ocean Territory" , "+246") ,
    Iraq("IQ" , "Iraq" , "+964") ,
    Iran("IR" , "Iran, Islamic Republic Of" , "+98") ,
    Iceland("IS" , "Iceland" , "+354") ,
    Italy("IT" , "Italy" , "+39") ,
    Jersey("JE" , "Jersey" , "+44" , arrayOf("+441534")) ,
    Jamaica("JM" , "Jamaica" , "+1" , arrayOf("+1876" , "+1658")) ,
    Jordan("JO" , "Jordan" , "+962") ,
    Japan("JP" , "Japan" , "+81") ,
    Kenya("KE" , "Kenya" , "+254") ,
    Kyrgyzstan("KG" , "Kyrgyzstan" , "+996") ,
    Cambodia("KH" , "Cambodia" , "+855") ,
    Kiribati("KI" , "Kiribati" , "+686") ,
    Comoros("KM" , "Comoros" , "+269") ,
    SaintKittsAndNevis("KN" , "Saint Kitts And Nevis" , "+1" , arrayOf("+1869")) ,
    NorthKorea("KP" , "North Korea" , "+850") ,
    SouthKorea("KR" , "South Korea" , "+82") ,
    Kuwait("KW" , "Kuwait" , "+965") ,
    CaymanIslands("KY" , "Cayman Islands" , "+1" , arrayOf("+1345")) ,
    Kazakhstan("KZ" , "Kazakhstan" , "+7" , arrayOf("+76" , "+77")) ,
    Lao("LA" , "Lao People's Democratic Republic" , "+856") ,
    Lebanon("LB" , "Lebanon" , "+961") ,
    SaintLucia("LC" , "Saint Lucia" , "+1" , arrayOf("+1758")) ,
    Liechtenstein("LI" , "Liechtenstein" , "+423") ,
    SriLanka("LK" , "Sri Lanka" , "+94") ,
    Liberia("LR" , "Liberia" , "+231") ,
    Lesotho("LS" , "Lesotho" , "+266") ,
    Lithuania("LT" , "Lithuania" , "+370") ,
    Luxembourg("LU" , "Luxembourg" , "+352") ,
    Latvia("LV" , "Latvia" , "+371") ,
    Libya("LY" , "Libya" , "+218") ,
    Morocco("MA" , "Morocco" , "+212") ,
    Monaco("MC" , "Monaco" , "+377") ,
    Moldova("MD" , "Moldova, Republic Of" , "+373") ,
    Montenegro("ME" , "Montenegro" , "+382") ,
    SaintMartin("MF" , "Saint Martin" , "+590") ,
    Madagascar("MG" , "Madagascar" , "+261") ,
    MarshallIslands("MH" , "Marshall Islands" , "+692") ,
    NorthMacedonia("MK" , "North Macedonia" , "+389") ,
    Mali("ML" , "Mali" , "+223") ,
    Myanmar("MM" , "Myanmar" , "+95") ,
    Mongolia("MN" , "Mongolia" , "+976") ,
    Macau("MO" , "Macau" , "+853") ,
    NorthernMarianaIslands("MP" , "Northern Mariana Islands" , "+1" , arrayOf("+1670")) ,
    Martinique("MQ" , "Martinique" , "+596") ,
    Mauritania("MR" , "Mauritania" , "+222") ,
    Montserrat("MS" , "Montserrat" , "+1" , arrayOf("+1664")) ,
    Malta("MT" , "Malta" , "+356") ,
    Mauritius("MU" , "Mauritius" , "+230") ,
    Maldives("MV" , "Maldives" , "+960") ,
    Malawi("MW" , "Malawi" , "+265") ,
    Mexico("MX" , "Mexico" , "+52") ,
    Malaysia("MY" , "Malaysia" , "+60") ,
    Mozambique("MZ" , "Mozambique" , "+258") ,
    Namibia("NA" , "Namibia" , "+264") ,
    NewCaledonia("NC" , "New Caledonia" , "+687") ,
    Niger("NE" , "Niger" , "+227") ,
    NorfolkIslands("NF" , "Norfolk Islands" , "+672" , arrayOf("+6723")) ,
    Nigeria("NG" , "Nigeria" , "+234") ,
    Nicaragua("NI" , "Nicaragua" , "+505") ,
    Netherlands("NL" , "Netherlands" , "+31") ,
    Norway("NO" , "Norway" , "+47") ,
    Nepal("NP" , "Nepal" , "+977") ,
    Nauru("NR" , "Nauru" , "+674") ,
    Niue("NU" , "Niue" , "+683") ,
    NewZealand("NZ" , "New Zealand" , "+64") ,
    Oman("OM" , "Oman" , "+968") ,
    Panama("PA" , "Panama" , "+507") ,
    Peru("PE" , "Peru" , "+51") ,
    FrenchPolynesia("PF" , "French Polynesia" , "+689") ,
    PapuaNewGuinea("PG" , "Papua New Guinea" , "+675") ,
    Philippines("PH" , "Philippines" , "+63") ,
    Pakistan("PK" , "Pakistan" , "+92") ,
    Poland("PL" , "Poland" , "+48") ,
    SaintPierreAndMiquelon("PM" , "Saint Pierre And Miquelon" , "+508") ,
    PitcairnIslands("PN" , "Pitcairn Islands" , "+870") ,
    PuertoRico("PR" , "Puerto Rico" , "+1" , arrayOf("+1787" , "+1939")) ,
    Palestine("PS" , "Palestine" , "+970") ,
    Portugal("PT" , "Portugal" , "+351") ,
    Palau("PW" , "Palau" , "+680") ,
    Paraguay("PY" , "Paraguay" , "+595") ,
    Qatar("QA" , "Qatar" , "+974") ,
    Reunion("RE" , "Réunion" , "+262" , arrayOf("+262")) ,
    Romania("RO" , "Romania" , "+40") ,
    Serbia("RS" , "Serbia" , "+381") ,
    RussianFederation("RU" , "Russian Federation" , "+7" , arrayOf("+7")) ,
    Rwanda("RW" , "Rwanda" , "+250") ,
    SaudiArabia("SA" , "Saudi Arabia" , "+966") ,
    SolomonIslands("SB" , "Solomon Islands" , "+677") ,
    Seychelles("SC" , "Seychelles" , "+248") ,
    Sudan("SD" , "Sudan" , "+249") ,
    Sweden("SE" , "Sweden" , "+46") ,
    Singapore("SG" , "Singapore" , "+65") ,
    SaintHelena("SH" , "Saint Helena, Ascension And Tristan Da Cunha" , "+290") ,
    Slovenia("SI" , "Slovenia" , "+386") ,
    Slovakia("SK" , "Slovakia" , "+421") ,
    SierraLeone("SL" , "Sierra Leone" , "+232") ,
    SanMarino("SM" , "San Marino" , "+378") ,
    Senegal("SN" , "Senegal" , "+221") ,
    Somalia("SO" , "Somalia" , "+252") ,
    Suriname("SR" , "Suriname" , "+597") ,
    SouthSudan("SS" , "South Sudan" , "+211") ,
    SaoTomeAndPrincipe("ST" , "Sao Tome And Principe" , "+239") ,
    ElSalvador("SV" , "El Salvador" , "+503") ,
    SintMaarten("SX" , "Sint Maarten" , "+1" , arrayOf("+1721")) ,
    Syria("SY" , "Syrian Arab Republic" , "+963") ,
    Swaziland("SZ" , "Swaziland" , "+268") ,
    TurksAndCaicosIslands("TC" , "Turks And Caicos Islands" , "+1" , arrayOf("+1649")) ,
    Chad("TD" , "Chad" , "+235") ,
    Togo("TG" , "Togo" , "+228") ,
    Thailand("TH" , "Thailand" , "+66") ,
    Tajikistan("TJ" , "Tajikistan" , "+992") ,
    Tokelau("TK" , "Tokelau" , "+690") ,
    TimorLeste("TL" , "Timor-leste" , "+670") ,
    Turkmenistan("TM" , "Turkmenistan" , "+993") ,
    Tunisia("TN" , "Tunisia" , "+216") ,
    Tonga("TO" , "Tonga" , "+676") ,
    Turkey("TR" , "Türkiye" , "+90") ,
    TrinidadAndTobago("TT" , "Trinidad & Tobago" , "+1" , arrayOf("+1868")) ,
    Tuvalu("TV" , "Tuvalu" , "+688") ,
    Taiwan("TW" , "Taiwan" , "+886") ,
    Tanzania("TZ" , "Tanzania, United Republic Of" , "+255") ,
    Ukraine("UA" , "Ukraine" , "+380") ,
    Uganda("UG" , "Uganda" , "+256") ,
    UnitedStates("US" ,
        "United States Of America" ,
        "+1" ,
        arrayOf("+1201" ,
            "+1202" ,
            "+1203" ,
            "+1205" ,
            "+1206" ,
            "+1207" ,
            "+1208" ,
            "+1209" ,
            "+1210" ,
            "+1212" ,
            "+1213" ,
            "+1214" ,
            "+1215" ,
            "+1216" ,
            "+1217" ,
            "+1218" ,
            "+1219" ,
            "+1220" ,
            "+1223" ,
            "+1224" ,
            "+1225" ,
            "+1227" ,
            "+1228" ,
            "+1229" ,
            "+1231" ,
            "+1234" ,
            "+1239" ,
            "+1240" ,
            "+1248" ,
            "+1251" ,
            "+1252" ,
            "+1253" ,
            "+1254" ,
            "+1256" ,
            "+1260" ,
            "+1262" ,
            "+1267" ,
            "+1269" ,
            "+1270" ,
            "+1272" ,
            "+1274" ,
            "+1276" ,
            "+1279" ,
            "+1281" ,
            "+1283" ,
            "+1301" ,
            "+1302" ,
            "+1303" ,
            "+1304" ,
            "+1305" ,
            "+1307" ,
            "+1308" ,
            "+1309" ,
            "+1310" ,
            "+1312" ,
            "+1313" ,
            "+1314" ,
            "+1315" ,
            "+1316" ,
            "+1317" ,
            "+1318" ,
            "+1319" ,
            "+1320" ,
            "+1321" ,
            "+1323" ,
            "+1325" ,
            "+1326" ,
            "+1327" ,
            "+1330" ,
            "+1331" ,
            "+1332" ,
            "+1334" ,
            "+1336" ,
            "+1337" ,
            "+1339" ,
            "+1340" ,
            "+1341" ,
            "+1346" ,
            "+1347" ,
            "+1351" ,
            "+1352" ,
            "+1360" ,
            "+1361" ,
            "+1364" ,
            "+1380" ,
            "+1385" ,
            "+1386" ,
            "+1401" ,
            "+1402" ,
            "+1404" ,
            "+1405" ,
            "+1406" ,
            "+1407" ,
            "+1408" ,
            "+1409" ,
            "+1410" ,
            "+1412" ,
            "+1413" ,
            "+1414" ,
            "+1415" ,
            "+1417" ,
            "+1419" ,
            "+1423" ,
            "+1424" ,
            "+1425" ,
            "+1430" ,
            "+1432" ,
            "+1434" ,
            "+1435" ,
            "+1440" ,
            "+1442" ,
            "+1443" ,
            "+1445" ,
            "+1447" ,
            "+1448" ,
            "+1458" ,
            "+1463" ,
            "+1464" ,
            "+1469" ,
            "+1470" ,
            "+1475" ,
            "+1478" ,
            "+1479" ,
            "+1480" ,
            "+1484" ,
            "+1501" ,
            "+1502" ,
            "+1503" ,
            "+1504" ,
            "+1505" ,
            "+1507" ,
            "+1508" ,
            "+1509" ,
            "+1510" ,
            "+1512" ,
            "+1513" ,
            "+1515" ,
            "+1516" ,
            "+1517" ,
            "+1518" ,
            "+1520" ,
            "+1521" ,
            "+1522" ,
            "+1523" ,
            "+1524" ,
            "+1525" ,
            "+1526" ,
            "+1530" ,
            "+1531" ,
            "+1534" ,
            "+1539" ,
            "+1540" ,
            "+1541" ,
            "+1551" ,
            "+1559" ,
            "+1561" ,
            "+1562" ,
            "+1563" ,
            "+1564" ,
            "+1567" ,
            "+1570" ,
            "+1571" ,
            "+1573" ,
            "+1574" ,
            "+1575" ,
            "+1580" ,
            "+1582" ,
            "+1585" ,
            "+1586" ,
            "+1601" ,
            "+1602" ,
            "+1603" ,
            "+1605" ,
            "+1606" ,
            "+1607" ,
            "+1608" ,
            "+1609" ,
            "+1610" ,
            "+1612" ,
            "+1614" ,
            "+1615" ,
            "+1616" ,
            "+1617" ,
            "+1618" ,
            "+1619" ,
            "+1620" ,
            "+1623" ,
            "+1626" ,
            "+1628" ,
            "+1629" ,
            "+1630" ,
            "+1631" ,
            "+1636" ,
            "+1640" ,
            "+1641" ,
            "+1646" ,
            "+1650" ,
            "+1651" ,
            "+1656" ,
            "+1657" ,
            "+1659" ,
            "+1660" ,
            "+1661" ,
            "+1662" ,
            "+1667" ,
            "+1669" ,
            "+1678" ,
            "+1680" ,
            "+1681" ,
            "+1682" ,
            "+1689" ,
            "+1701" ,
            "+1702" ,
            "+1703" ,
            "+1704" ,
            "+1706" ,
            "+1707" ,
            "+1708" ,
            "+1710" ,
            "+1712" ,
            "+1713" ,
            "+1714" ,
            "+1715" ,
            "+1716" ,
            "+1717" ,
            "+1718" ,
            "+1719" ,
            "+1720" ,
            "+1724" ,
            "+1725" ,
            "+1727" ,
            "+1730" ,
            "+1731" ,
            "+1732" ,
            "+1734" ,
            "+1737" ,
            "+1740" ,
            "+1743" ,
            "+1747" ,
            "+1754" ,
            "+1757" ,
            "+1760" ,
            "+1762" ,
            "+1763" ,
            "+1765" ,
            "+1769" ,
            "+1770" ,
            "+1772" ,
            "+1773" ,
            "+1774" ,
            "+1775" ,
            "+1779" ,
            "+1781" ,
            "+1785" ,
            "+1786" ,
            "+1801" ,
            "+1802" ,
            "+1803" ,
            "+1804" ,
            "+1805" ,
            "+1806" ,
            "+1808" ,
            "+1810" ,
            "+1812" ,
            "+1813" ,
            "+1814" ,
            "+1815" ,
            "+1816" ,
            "+1817" ,
            "+1818" ,
            "+1820" ,
            "+1828" ,
            "+1830" ,
            "+1831" ,
            "+1832" ,
            "+1838" ,
            "+1839" ,
            "+1843" ,
            "+1845" ,
            "+1847" ,
            "+1848" ,
            "+1850" ,
            "+1854" ,
            "+1856" ,
            "+1857" ,
            "+1858" ,
            "+1859" ,
            "+1860" ,
            "+1862" ,
            "+1863" ,
            "+1864" ,
            "+1865" ,
            "+1870" ,
            "+1872" ,
            "+1878" ,
            "+1901" ,
            "+1903" ,
            "+1904" ,
            "+1906" ,
            "+1907" ,
            "+1908" ,
            "+1909" ,
            "+1910" ,
            "+1912" ,
            "+1913" ,
            "+1914" ,
            "+1915" ,
            "+1916" ,
            "+1917" ,
            "+1918" ,
            "+1919" ,
            "+1920" ,
            "+1925" ,
            "+1928" ,
            "+1929" ,
            "+1930" ,
            "+1931" ,
            "+1934" ,
            "+1936" ,
            "+1937" ,
            "+1938" ,
            "+1940" ,
            "+1941" ,
            "+1947" ,
            "+1949" ,
            "+1951" ,
            "+1952" ,
            "+1954" ,
            "+1956" ,
            "+1959" ,
            "+1970" ,
            "+1971" ,
            "+1972" ,
            "+1973" ,
            "+1978" ,
            "+1979" ,
            "+1980" ,
            "+1984" ,
            "+1985" ,
            "+1986" ,
            "+1989")) ,
    Uruguay("UY" , "Uruguay" , "+598") ,
    Uzbekistan("UZ" , "Uzbekistan" , "+998") ,
    VaticanCity("VA" , "Vatican City" , "+379") ,
    SaintVincentAndTheGrenadines("VC" , "Saint Vincent & The Grenadines" , "+1" , arrayOf("+1784")) ,
    Venezuela("VE" , "Venezuela, Bolivarian Republic Of" , "+58") ,
    BritishVirginIslands("VG" , "British Virgin Islands" , "+1" , arrayOf("+1284")) ,
    USVirginIslands("VI" , "US Virgin Islands" , "+1" , arrayOf("+1340")) ,
    Vietnam("VN" , "Vietnam" , "+84") ,
    Vanuatu("VU" , "Vanuatu" , "+678") ,
    WallisAndFutuna("WF" , "Wallis And Futuna" , "+681") ,
    Samoa("WS" , "Samoa" , "+685") ,
    Kosovo("XK" , "Kosovo" , "+383") ,
    Yemen("YE" , "Yemen" , "+967") ,
    Mayotte("YT" , "Mayotte" , "+262" , arrayOf("+262269" , "+262639")) ,
    SouthAfrica("ZA" , "South Africa" , "+27") ,
    Zambia("ZM" , "Zambia" , "+260") ,
    Zimbabwe("ZW" , "Zimbabwe" , "+263");
    
    @Composable
    fun getLocalisedName() : String {
        val resId = getResourceId(this)
        return stringResource(resId)
    }
    
    fun getLocalisedName(context : Context) : String {
        val resId = getResourceId(this)
        return context.getString(resId)
    }
    
    private fun getResourceId(country : Country) : Int {
        return when (country) {
            Andorra -> R.string.andorra
            UnitedArabEmirates -> R.string.united_arab_emirates
            Afghanistan -> R.string.afghanistan
            AmericanSamoa -> R.string.american_samoa
            Albania -> R.string.albania
            Armenia -> R.string.armenia
            Angola -> R.string.angola
            Antarctica -> R.string.antarctica
            Argentina -> R.string.argentina
            Austria -> R.string.austria
            Australia -> R.string.australia
            Aruba -> R.string.aruba
            Bahamas -> R.string.bahamas
            Bahrain -> R.string.bahrain
            Bangladesh -> R.string.bangladesh
            Barbados -> R.string.barbados
            Belarus -> R.string.belarus
            Belgium -> R.string.belgium
            Belize -> R.string.belize
            Benin -> R.string.benin
            Bermuda -> R.string.bermuda
            Bhutan -> R.string.bhutan
            Bolivia -> R.string.bolivia
            BosniaAndHerzegovina -> R.string.bosnia
            Botswana -> R.string.botswana
            Brazil -> R.string.brazil
            BritishIndianOceanTerritory -> R.string.british_indian_ocean
            BruneiDarussalam -> R.string.brunei_darussalam
            Bulgaria -> R.string.bulgaria
            BurkinaFaso -> R.string.burkina_faso
            Burundi -> R.string.burundi
            Cambodia -> R.string.cambodia
            Cameroon -> R.string.cameroon
            Canada -> R.string.canada
            CapeVerde -> R.string.cape_verde
            CaymanIslands -> R.string.cayman_islands
            CentralAfricanRepublic -> R.string.central_african
            Chad -> R.string.chad
            Chile -> R.string.chile
            China -> R.string.china
            Christmas -> R.string.christmas_island
            CocosKeelingIslands -> R.string.cocos
            Colombia -> R.string.colombia
            Comoros -> R.string.comoros
            CongoBrazzavilleRepublic -> R.string.congo
            CongoKinshasaDRC -> R.string.congo_democratic
            CookIslands -> R.string.cook_islands
            CostaRica -> R.string.costa_rica
            CoteDivoire -> R.string.cote_dlvoire
            Croatia -> R.string.croatia
            Cuba -> R.string.cuba
            Curacao -> R.string.curacao
            CyprusIsland -> R.string.cyprus
            CzechRepublic -> R.string.czech_republic
            Denmark -> R.string.denmark
            Djibouti -> R.string.djibouti
            Dominica -> R.string.dominica
            DominicanRepublic -> R.string.dominican_republic
            Ecuador -> R.string.ecuador
            Egypt -> R.string.egypt
            ElSalvador -> R.string.el_salvador
            EquatorialGuinea -> R.string.equatorial_guinea
            Eritrea -> R.string.eritrea
            Estonia -> R.string.estonia
            Ethiopia -> R.string.ethiopia
            FalklandIslands -> R.string.falkland_islands
            FaroeIslands -> R.string.faroe_islands
            Fiji -> R.string.fiji
            Finland -> R.string.finland
            France -> R.string.france
            FrenchGuyana -> R.string.french_guiana
            FrenchPolynesia -> R.string.french_polynesia
            Gabon -> R.string.gabon
            Gambia -> R.string.gambia
            Georgia -> R.string.georgia
            Germany -> R.string.germany
            Ghana -> R.string.ghana
            Gibraltar -> R.string.gibraltar
            Greenland -> R.string.greenland
            Grenada -> R.string.grenada
            Guadeloupe -> R.string.guadeloupe
            Guam -> R.string.guam
            Guatemala -> R.string.guatemala
            Guinea -> R.string.guinea
            GuineaBissau -> R.string.guinea_bissau
            Guyana -> R.string.guyana
            Haiti -> R.string.haiti
            Honduras -> R.string.honduras
            HongKong -> R.string.hong_kong
            Hungary -> R.string.hungary
            Iceland -> R.string.iceland
            India -> R.string.india
            Indonesia -> R.string.indonesia
            Iran -> R.string.iran
            Iraq -> R.string.iraq
            Ireland -> R.string.ireland
            Israel -> R.string.israil
            Italy -> R.string.italia
            Jamaica -> R.string.jamaica
            Japan -> R.string.japan
            Jersey -> R.string.jersey
            Jordan -> R.string.jordan
            Kazakhstan -> R.string.kazakhstan
            Kenya -> R.string.kenya
            Kiribati -> R.string.kiribati
            Kosovo -> R.string.kosovo
            Kuwait -> R.string.kuwait
            Kyrgyzstan -> R.string.kyrgyzstan
            Lao -> R.string.laos
            Latvia -> R.string.latvia
            Lebanon -> R.string.lebanon
            Lesotho -> R.string.lesotho
            Liberia -> R.string.liberia
            Libya -> R.string.libya
            Liechtenstein -> R.string.liechtenstein
            Lithuania -> R.string.lithuania
            Luxembourg -> R.string.luxembourg
            Macau -> R.string.macau
            Madagascar -> R.string.madagascar
            Malawi -> R.string.malawi
            Malaysia -> R.string.malaysia
            Maldives -> R.string.maldives
            Mali -> R.string.mali
            Malta -> R.string.malta
            MarshallIslands -> R.string.marshall_islands
            Martinique -> R.string.martinique
            Mauritania -> R.string.mauritania
            Mauritius -> R.string.mauritius
            Mayotte -> R.string.mayotte
            Mexico -> R.string.mexico
            Micronesia -> R.string.micronesia
            Moldova -> R.string.moldova
            Monaco -> R.string.monaco
            Mongolia -> R.string.mongolia
            Montenegro -> R.string.montenegro
            Montserrat -> R.string.montserrat
            Morocco -> R.string.morocco
            Mozambique -> R.string.mozambique
            Myanmar -> R.string.myanmar
            Namibia -> R.string.namibia
            Nauru -> R.string.nauru
            Nepal -> R.string.nepal
            Netherlands -> R.string.netherlands
            NewCaledonia -> R.string.new_caledonia
            NewZealand -> R.string.new_zealand
            Nicaragua -> R.string.nicaragua
            Niger -> R.string.niger
            Nigeria -> R.string.nigeria
            Niue -> R.string.niue
            NorfolkIslands -> R.string.norfolk
            NorthKorea -> R.string.north_korea
            NorthMacedonia -> R.string.north_macedonia
            NorthernMarianaIslands -> R.string.northern_mariana
            Norway -> R.string.norway
            Oman -> R.string.oman
            Pakistan -> R.string.pakistan
            Palau -> R.string.palau
            Panama -> R.string.panama
            PapuaNewGuinea -> R.string.papua_new_guinea
            Paraguay -> R.string.paraguay
            Peru -> R.string.peru
            Philippines -> R.string.philippines
            PitcairnIslands -> R.string.pitcairn
            Poland -> R.string.poland
            Portugal -> R.string.portugal
            PuertoRico -> R.string.puerto_rico
            Qatar -> R.string.qatar
            Reunion -> R.string.reunion
            Romania -> R.string.romania
            RussianFederation -> R.string.russia
            Rwanda -> R.string.rwanda
            SaintBarthelemy -> R.string.saint_barhelemy
            SaintHelena -> R.string.saint_helena
            SaintKittsAndNevis -> R.string.saint_kitts
            SaintLucia -> R.string.saint_lucia
            SaintMartin -> R.string.saint_martin
            SaintPierreAndMiquelon -> R.string.saint_pierre
            SaintVincentAndTheGrenadines -> R.string.saint_vincent
            Samoa -> R.string.samoa
            SanMarino -> R.string.san_marino
            SaoTomeAndPrincipe -> R.string.sao_tome
            SaudiArabia -> R.string.saudi_arabia
            Senegal -> R.string.senegal
            Serbia -> R.string.serbia
            Seychelles -> R.string.seychelles
            SierraLeone -> R.string.sierra_leone
            Singapore -> R.string.singapore
            SintMaarten -> R.string.sint_maarten
            Slovakia -> R.string.slovakia
            Slovenia -> R.string.slovenia
            SolomonIslands -> R.string.solomon_islands
            Somalia -> R.string.somalia
            SouthAfrica -> R.string.south_africa
            SouthKorea -> R.string.south_korea
            SouthSudan -> R.string.south_sudan
            Spain -> R.string.spain
            Palestine -> R.string.state_of_palestine
            Sudan -> R.string.sudan
            Suriname -> R.string.suriname
            Swaziland -> R.string.swaziland
            Sweden -> R.string.sweden
            Switzerland -> R.string.switzerland
            Syria -> R.string.syria
            Tajikistan -> R.string.taijikistan
            Taiwan -> R.string.taiwan
            Tanzania -> R.string.tazmania
            Thailand -> R.string.thailand
            TimorLeste -> R.string.timor_leste
            Togo -> R.string.togo
            Tokelau -> R.string.tokelau
            Tonga -> R.string.tonga
            TrinidadAndTobago -> R.string.trinidad_and_tobago
            Tunisia -> R.string.tunisia
            Turkey -> R.string.turkey
            Turkmenistan -> R.string.turkmenistan
            TurksAndCaicosIslands -> R.string.turks_and_caicos
            Tuvalu -> R.string.tuvalu
            Uganda -> R.string.uganda
            Ukraine -> R.string.ukraine
            UnitedStates -> R.string.united_states_america
            Uruguay -> R.string.uruguay
            Uzbekistan -> R.string.uzbekistan
            Vanuatu -> R.string.vanuatu
            Venezuela -> R.string.venezuela
            Vietnam -> R.string.vietnam
            BritishVirginIslands -> R.string.virgin_islands
            USVirginIslands -> R.string.virgin_islands_us
            WallisAndFutuna -> R.string.wallis_and_futuna
            Yemen -> R.string.yemen
            Zambia -> R.string.zambia
            Zimbabwe -> R.string.zimbabwe
            AntiguaAndBarbuda -> R.string.antigua_and_barbuda
            Anguilla -> R.string.anguilla
            AlandIslands -> R.string.aland_islands
            Azerbaijan -> R.string.azerbaijan
            Algeria -> R.string.algeria
            UnitedKingdom -> R.string.united_kingdom
            Greece -> R.string.greece
            IsleOfMan -> R.string.isle_of_man
            SriLanka -> R.string.siri_lanka
            VaticanCity -> R.string.holy_see
        }
    }
    
    companion object {
        
        
        /**
         * Get all countries
         * @return List<Countries>
         */
        fun getAllCountries() : List<Country> {
            return entries.sortedBy { it.countryName }
        }
        
        /**
         * Get selected countries
         * @param selectedCountries List<Countries>
         * @return List<Countries>
         */
        fun getSelectedCountries(selectedCountries : List<Country>) : List<Country> {
            return selectedCountries
        }
        
        /**
         * Get all countries except selected countries
         * @param selectedCountries List<Countries>
         * @return List<Countries>
         */
        fun getAllCountriesExcept(selectedCountries : List<Country>) : List<Country> {
            return entries.filter { it !in selectedCountries }
        }
        
        /**
         * Get country by iso
         * @param iso String
         * @return Country?
         */
        fun getCountryByIso(iso : String) : Country? {
            return entries.find { it.countryIso == iso.uppercase() }
        }
        
        
        /**
         * Search country by query
         * @param query String
         * @param context Context
         * @param findSingle Boolean Whether to look for exact country code matches
         * @param list List<Country> List of countries to search from
         * @return List<Country> List of matching countries
         */
        fun searchCountry(
            query: String,
            context: Context,
            findSingle: Boolean = false,
            list: List<Country> = getAllCountries()
        ): List<Country> {
            val normalizedQuery = query.trim()
            if (normalizedQuery.isEmpty()) return list
            
            // Generate search queries from input (handles potential phone numbers)
            val searchQueries = generateSearchQueries(normalizedQuery)
            
            // Find the first set of matches across all potential queries
            val filteredCountries = findFirstMatches(searchQueries, list, context, findSingle)
            if (filteredCountries.isEmpty()) return emptyList()
            
            // If only one country found, return it immediately
            if (filteredCountries.size == 1) return filteredCountries
            
            // Try to find more specific matches using localCountryCodes
            return findMatchesWithLocalCodes(searchQueries, filteredCountries)
                .ifEmpty { filteredCountries }
        }
        
        /**
         * Generate a list of potential search queries from the input
         * Especially useful for phone numbers that start with "+"
         */
        private fun generateSearchQueries(query: String): List<String> {
            val queries = mutableListOf(query)
            
            // If query starts with +, extract potential country codes
            if (query.startsWith("+") && query.length > 1) {
                for (i in minOf(6, query.length - 1) downTo 1) {
                    val potentialCode = query.substring(0, i + 1) // +1, +12, +123, etc.
                    if (potentialCode != query) { // Don't add the full query again
                        queries.add(potentialCode)
                    }
                }
            }
            
            return queries
        }
        
        /**
         * Find the first set of matches from the search queries
         */
        private fun findFirstMatches(
            searchQueries: List<String>,
            countries: List<Country>,
            context: Context,
            findSingle: Boolean
        ): List<Country> {
            for (query in searchQueries) {
                val matches = countries.filter { country ->
                    val localisedName = country.getLocalisedName(context)
                    
                    country.countryIso.contains(query, true) ||
                    country.countryName.contains(query, true) ||
                    ((country.countryCode == query && findSingle) ||
                     (country.countryCode.contains(query) && !findSingle)) ||
                    localisedName.contains(query, true)
                }
                
                if (matches.isNotEmpty()) {
                    return matches
                }
            }
            
            return emptyList()
        }
        
        /**
         * Find matches with local country codes from a filtered list
         */
        private fun findMatchesWithLocalCodes(
            searchQueries: List<String>,
            filteredCountries: List<Country>
        ): List<Country> {
            for (query in searchQueries) {
                val matches = filteredCountries.filter { country ->
                    country.localCountryCodes.any { it == query }
                }
                
                if (matches.isNotEmpty()) {
                    return matches
                }
            }
            
            return emptyList()
        }
        
        /**
         * Find a single country by query
         * @param query String
         * @param list List<Countries>
         * @return Country
         */
        fun findCountry(query : String , context : Context , list : List<Country> = getAllCountries()) : Country {
            val countries = searchCountry(query = query , context = context , findSingle = true , list = list)
            return countries.firstOrNull() ?: list.first()
        }
    }
    
}
