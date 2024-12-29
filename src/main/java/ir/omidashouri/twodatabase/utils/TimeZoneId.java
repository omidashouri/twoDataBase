package ir.omidashouri.twodatabase.utils;

import java.time.ZoneId;
import java.util.Arrays;
import java.util.Locale;

public enum TimeZoneId {

    ETC_GMT_PLUS_12("-12:00", "Etc/GMT+12"),
    ETC_GMT_PLUS_11("-11:00", "Etc/GMT+11"),
    PACIFIC_APIA("-11:00", "Pacific/Apia"),
    PACIFIC_MIDWAY("-11:00", "Pacific/Midway"),
    PACIFIC_NIUE("-11:00", "Pacific/Niue"),
    PACIFIC_PAGO_PAGO("-11:00", "Pacific/Pago_Pago"),
    AMERICA_ADAK("-10:00", "America/Adak"),
    ETC_GMT_PLUS_10("-10:00", "Etc/GMT+10"),
    HST("-10:00", "HST"),
    PACIFIC_FAKAOFO("-10:00", "Pacific/Fakaofo"),
    PACIFIC_HONOLULU("-10:00", "Pacific/Honolulu"),
    PACIFIC_JOHNSTON("-10:00", "Pacific/Johnston"),
    PACIFIC_RAROTONGA("-10:00", "Pacific/Rarotonga"),
    PACIFIC_TAHITI("-10:00", "Pacific/Tahiti"),
    PACIFIC_MARQUESAS("-09:30", "Pacific/Marquesas"),
    AMERICA_ANCHORAGE("-09:00", "America/Anchorage"),
    AMERICA_JUNEAU("-09:00", "America/Juneau"),
    AMERICA_NOME("-09:00", "America/Nome"),
    AMERICA_YAKUTAT("-09:00", "America/Yakutat"),
    ETC_GMT_PLUS_9("-09:00", "Etc/GMT+9"),
    PACIFIC_GAMBIER("-09:00", "Pacific/Gambier"),
    AMERICA_DAWSON("-08:00", "America/Dawson"),
    AMERICA_LOS_ANGELES("-08:00", "America/Los_Angeles"),
    AMERICA_SANTA_ISABEL("-08:00", "America/Santa_Isabel"),
    AMERICA_TIJUANA("-08:00", "America/Tijuana"),
    AMERICA_VANCOUVER("-08:00", "America/Vancouver"),
    AMERICA_WHITEHORSE("-08:00", "America/Whitehorse"),
    ETC_GMT_PLUS_8("-08:00", "Etc/GMT+8"),
    PST8PDT("-08:00", "PST8PDT"),
    PACIFIC_PITCAIRN("-08:00", "Pacific/Pitcairn"),
    AMERICA_BOISE("-07:00", "America/Boise"),
    AMERICA_CAMBRIDGE_BAY("-07:00", "America/Cambridge_Bay"),
    AMERICA_CHIHUAHUA("-07:00", "America/Chihuahua"),
    AMERICA_DAWSON_CREEK("-07:00", "America/Dawson_Creek"),
    AMERICA_DENVER("-07:00", "America/Denver"),
    AMERICA_EDMONTON("-07:00", "America/Edmonton"),
    AMERICA_HERMOSILLO("-07:00", "America/Hermosillo"),
    AMERICA_INUVIK("-07:00", "America/Inuvik"),
    AMERICA_MAZATLAN("-07:00", "America/Mazatlan"),
    AMERICA_OJINAGA("-07:00", "America/Ojinaga"),
    AMERICA_PHOENIX("-07:00", "America/Phoenix"),
    AMERICA_YELLOWKNIFE("-07:00", "America/Yellowknife"),
    ETC_GMT_PLUS_7("-07:00", "Etc/GMT+7"),
    MST("-07:00", "MST"),
    MST7MDT("-07:00", "MST7MDT"),
    AMERICA_BAHIA_BANDERAS("-06:00", "America/Bahia_Banderas"),
    AMERICA_BELIZE("-06:00", "America/Belize"),
    AMERICA_CANCUN("-06:00", "America/Cancun"),
    AMERICA_CHICAGO("-06:00", "America/Chicago"),
    AMERICA_COSTA_RICA("-06:00", "America/Costa_Rica"),
    AMERICA_EL_SALVADOR("-06:00", "America/El_Salvador"),
    AMERICA_GUATEMALA("-06:00", "America/Guatemala"),
    AMERICA_INDIANA_KNOX("-06:00", "America/Indiana/Knox"),
    AMERICA_INDIANA_TELL_CITY("-06:00", "America/Indiana/Tell_City"),
    AMERICA_MANAGUA("-06:00", "America/Managua"),
    AMERICA_MATAMOROS("-06:00", "America/Matamoros"),
    AMERICA_MENOMINEE("-06:00", "America/Menominee"),
    AMERICA_MERIDA("-06:00", "America/Merida"),
    AMERICA_MEXICO_CITY("-06:00", "America/Mexico_City"),
    AMERICA_MONTERREY("-06:00", "America/Monterrey"),
    AMERICA_NORTH_DAKOTA_CENTER("-06:00", "America/North_Dakota/Center"),
    AMERICA_NORTH_DAKOTA_NEW_SALEM("-06:00", "America/North_Dakota/New_Salem"),
    AMERICA_RAINY_RIVER("-06:00", "America/Rainy_River"),
    AMERICA_RANKIN_INLET("-06:00", "America/Rankin_Inlet"),
    AMERICA_REGINA("-06:00", "America/Regina"),
    AMERICA_SWIFT_CURRENT("-06:00", "America/Swift_Current"),
    AMERICA_TEGUCIGALPA("-06:00", "America/Tegucigalpa"),
    AMERICA_WINNIPEG("-06:00", "America/Winnipeg"),
    CST6CDT("-06:00", "CST6CDT"),
    ETC_GMT_PLUS_6("-06:00", "Etc/GMT+6"),
    PACIFIC_EASTER("-06:00", "Pacific/Easter"),
    PACIFIC_GALAPAGOS("-06:00", "Pacific/Galapagos"),
    AMERICA_ATIKOKAN("-05:00", "America/Atikokan"),
    AMERICA_BOGOTA("-05:00", "America/Bogota"),
    AMERICA_CAYMAN("-05:00", "America/Cayman"),
    AMERICA_DETROIT("-05:00", "America/Detroit"),
    AMERICA_GRAND_TURK("-05:00", "America/Grand_Turk"),
    AMERICA_GUAYAQUIL("-05:00", "America/Guayaquil"),
    AMERICA_HAVANA("-05:00", "America/Havana"),
    AMERICA_INDIANA_INDIANAPOLIS("-05:00", "America/Indiana/Indianapolis"),
    AMERICA_INDIANA_MARENGO("-05:00", "America/Indiana/Marengo"),
    AMERICA_INDIANA_PETERSBURG("-05:00", "America/Indiana/Petersburg"),
    AMERICA_INDIANA_VEVAY("-05:00", "America/Indiana/Vevay"),
    AMERICA_INDIANA_VINCENNES("-05:00", "America/Indiana/Vincennes"),
    AMERICA_INDIANA_WINAMAC("-05:00", "America/Indiana/Winamac"),
    AMERICA_IQALUIT("-05:00", "America/Iqaluit"),
    AMERICA_JAMAICA("-05:00", "America/Jamaica\tJamaica"),
    AMERICA_KENTUCKY_LOUISVILLE("-05:00", "America/Kentucky/Louisville"),
    AMERICA_KENTUCKY_MONTICELLO("-05:00", "America/Kentucky/Monticello"),
    AMERICA_LIMA("-05:00", "America/Lima"),
    AMERICA_MONTREAL("-05:00", "America/Montreal"),
    AMERICA_NASSAU("-05:00", "America/Nassau"),
    AMERICA_NEW_YORK("-05:00", "America/New_York"),
    AMERICA_NIPIGON("-05:00", "America/Nipigon"),
    AMERICA_PANAMA("-05:00", "America/Panama"),
    AMERICA_PANGNIRTUNG("-05:00", "America/Pangnirtung"),
    AMERICA_PORT_MINUS_AU_MINUS_PRINCE("-05:00", "America/Port-au-Prince"),
    AMERICA_RESOLUTE("-05:00", "America/Resolute"),
    AMERICA_THUNDER_BAY("-05:00", "America/Thunder_Bay"),
    AMERICA_TORONTO("-05:00", "America/Toronto"),
    EST("-05:00", "EST"),
    EST5EDT("-05:00", "EST5EDT"),
    ETC_GMT_PLUS_5("-05:00", "Etc/GMT+5"),
    AMERICA_CARACAS("-04:30", "America/Caracas"),
    AMERICA_ANGUILLA("-04:00", "America/Anguilla"),
    AMERICA_ANTIGUA("-04:00", "America/Antigua"),
    AMERICA_ARGENTINA_SAN_LUIS("-03:00", "America/Argentina/San_Luis"),
    AMERICA_ARUBA("-04:00", "America/Aruba"),
    AMERICA_ASUNCION("-04:00", "America/Asuncion"),
    AMERICA_BARBADOS("-04:00", "America/Barbados"),
    AMERICA_BLANC_MINUS_SABLON("-04:00", "America/Blanc-Sablon"),
    AMERICA_BOA_VISTA("-04:00", "America/Boa_Vista"),
    AMERICA_CAMPO_GRANDE("-04:00", "America/Campo_Grande"),
    AMERICA_CUIABA("-04:00", "America/Cuiaba"),
    AMERICA_CURACAO("-04:00", "America/Curacao"),
    AMERICA_DOMINICA("-04:00", "America/Dominica"),
    AMERICA_EIRUNEPE("-04:00", "America/Eirunepe"),
    AMERICA_GLACE_BAY("-04:00", "America/Glace_Bay"),
    AMERICA_GOOSE_BAY("-04:00", "America/Goose_Bay"),
    AMERICA_GRENADA("-04:00", "America/Grenada"),
    AMERICA_GUADELOUPE("-04:00", "America/Guadeloupe"),
    AMERICA_GUYANA("-04:00", "America/Guyana"),
    AMERICA_HALIFAX("-04:00", "America/Halifax"),
    AMERICA_LA_PAZ("-04:00", "America/La_Paz"),
    AMERICA_MANAUS("-04:00", "America/Manaus"),
    AMERICA_MARTINIQUE("-04:00", "America/Martinique"),
    AMERICA_MONCTON("-04:00", "America/Moncton"),
    AMERICA_MONTSERRAT("-04:00", "America/Montserrat"),
    AMERICA_PORT_OF_SPAIN("-04:00", "America/Port_of_Spain"),
    AMERICA_PORTO_VELHO("-04:00", "America/Porto_Velho"),
    AMERICA_PUERTO_RICO("-04:00", "America/Puerto_Rico"),
    AMERICA_RIO_BRANCO("-04:00", "America/Rio_Branco"),
    AMERICA_SANTIAGO("-04:00", "America/Santiago"),
    AMERICA_SANTO_DOMINGO("-04:00", "America/Santo_Domingo"),
    AMERICA_ST_KITTS("-04:00", "America/St_Kitts"),
    AMERICA_ST_LUCIA("-04:00", "America/St_Lucia"),
    AMERICA_ST_THOMAS("-04:00", "America/St_Thomas"),
    AMERICA_ST_VINCENT("-04:00", "America/St_Vincent"),
    AMERICA_THULE("-04:00", "America/Thule"),
    AMERICA_TORTOLA("-04:00", "America/Tortola"),
    ANTARCTICA_PALMER("-04:00", "Antarctica/Palmer"),
    ATLANTIC_BERMUDA("-04:00", "Atlantic/Bermuda"),
    ATLANTIC_STANLEY("-04:00", "Atlantic/Stanley"),
    ETC_GMT_PLUS_4("-04:00", "Etc/GMT+4"),
    AMERICA_ST_JOHNS("-03:30", "America/St_Johns"),
    AMERICA_ARAGUAINA("-03:00", "America/Araguaina"),
    AMERICA_ARGENTINA_BUENOS_AIRES("-03:00", "America/Argentina/Buenos_Aires"),
    AMERICA_ARGENTINA_CATAMARCA("-03:00", "America/Argentina/Catamarca"),
    AMERICA_ARGENTINA_CORDOBA("-03:00", "America/Argentina/Cordoba"),
    AMERICA_ARGENTINA_JUJUY("-03:00", "America/Argentina/Jujuy"),
    AMERICA_ARGENTINA_LA_RIOJA("-03:00", "America/Argentina/La_Rioja"),
    AMERICA_ARGENTINA_MENDOZA("-03:00", "America/Argentina/Mendoza"),
    AMERICA_ARGENTINA_RIO_GALLEGOS("-03:00", "America/Argentina/Rio_Gallegos"),
    AMERICA_ARGENTINA_SALTA("-03:00", "America/Argentina/Salta"),
    AMERICA_ARGENTINA_SAN_JUAN("-03:00", "America/Argentina/San_Juan"),
    AMERICA_ARGENTINA_TUCUMAN("-03:00", "America/Argentina/Tucuman"),
    AMERICA_ARGENTINA_USHUAIA("-03:00", "America/Argentina/Ushuaia"),
    AMERICA_BAHIA("-03:00", "America/Bahia"),
    AMERICA_BELEM("-03:00", "America/Belem"),
    AMERICA_CAYENNE("-03:00", "America/Cayenne"),
    AMERICA_FORTALEZA("-03:00", "America/Fortaleza"),
    AMERICA_GODTHAB("-03:00", "America/Godthab"),
    AMERICA_MACEIO("-03:00", "America/Maceio"),
    AMERICA_MIQUELON("-03:00", "America/Miquelon"),
    AMERICA_MONTEVIDEO("-03:00", "America/Montevideo"),
    AMERICA_PARAMARIBO("-03:00", "America/Paramaribo"),
    AMERICA_RECIFE("-03:00", "America/Recife"),
    AMERICA_SANTAREM("-03:00", "America/Santarem"),
    AMERICA_SAO_PAULO("-03:00", "America/Sao_Paulo"),
    ANTARCTICA_ROTHERA("-03:00", "Antarctica/Rothera"),
    ETC_GMT_PLUS_3("-03:00", "Etc/GMT+3"),
    AMERICA_NORONHA("-02:00", "America/Noronha"),
    ATLANTIC_SOUTH_GEORGIA("-02:00", "Atlantic/South_Georgia"),
    ETC_GMT_PLUS_2("-02:00", "Etc/GMT+2"),
    AMERICA_SCORESBYSUND("-01:00", "America/Scoresbysund"),
    ATLANTIC_AZORES("-01:00", "Atlantic/Azores"),
    ATLANTIC_CAPE_VERDE("-01:00", "Atlantic/Cape_Verde"),
    ETC_GMT_PLUS_1("-01:00", "Etc/GMT+1"),
    AFRICA_ABIDJAN("+00:00", "Africa/Abidjan"),
    AFRICA_ACCRA("+00:00", "Africa/Accra"),
    AFRICA_BAMAKO("+00:00", "Africa/Bamako"),
    AFRICA_BANJUL("+00:00", "Africa/Banjul"),
    AFRICA_BISSAU("+00:00", "Africa/Bissau"),
    AFRICA_CASABLANCA("+00:00", "Africa/Casablanca"),
    AFRICA_CONAKRY("+00:00", "Africa/Conakry"),
    AFRICA_DAKAR("+00:00", "Africa/Dakar"),
    AFRICA_EL_AAIUN("+00:00", "Africa/El_Aaiun"),
    AFRICA_FREETOWN("+00:00", "Africa/Freetown"),
    AFRICA_LOME("+00:00", "Africa/Lome"),
    AFRICA_MONROVIA("+00:00", "Africa/Monrovia"),
    AFRICA_NOUAKCHOTT("+00:00", "Africa/Nouakchott"),
    AFRICA_OUAGADOUGOU("+00:00", "Africa/Ouagadougou"),
    AFRICA_SAO_TOME("+00:00", "Africa/Sao_Tome"),
    AMERICA_DANMARKSHAVN("+00:00", "America/Danmarkshavn"),
    ATLANTIC_CANARY("+00:00", "Atlantic/Canary"),
    ATLANTIC_FAROE("+00:00", "Atlantic/Faroe"),
    ATLANTIC_MADEIRA("+00:00", "Atlantic/Madeira"),
    ATLANTIC_REYKJAVIK("+00:00", "Atlantic/Reykjavik"),
    ATLANTIC_ST_HELENA("+00:00", "Atlantic/St_Helena"),
    ETC_GMT("+00:00", "Etc/GMT"),
    GMT("+00:00", "GMT"),
    ETC_UCT("+00:00", "Etc/UCT"),
    ETC_UTC("+00:00", "Etc/UTC"),
    EUROPE_DUBLIN("+00:00", "Europe/Dublin"),
    EUROPE_LISBON("+00:00", "Europe/Lisbon"),
    EUROPE_LONDON("+00:00", "Europe/London"),
    UTC("+00:00", "UTC"),
    WET("+00:00", "WET"),
    AFRICA_ALGIERS("+01:00", "Africa/Algiers"),
    AFRICA_BANGUI("+01:00", "Africa/Bangui"),
    AFRICA_BRAZZAVILLE("+01:00", "Africa/Brazzaville"),
    AFRICA_CEUTA("+01:00", "Africa/Ceuta"),
    AFRICA_DOUALA("+01:00", "Africa/Douala"),
    AFRICA_KINSHASA("+01:00", "Africa/Kinshasa"),
    AFRICA_LAGOS("+01:00", "Africa/Lagos"),
    AFRICA_LIBREVILLE("+01:00", "Africa/Libreville"),
    AFRICA_LUANDA("+01:00", "Africa/Luanda"),
    AFRICA_MALABO("+01:00", "Africa/Malabo"),
    AFRICA_NDJAMENA("+01:00", "Africa/Ndjamena"),
    AFRICA_NIAMEY("+01:00", "Africa/Niamey"),
    AFRICA_PORTO_MINUS_NOVO("+01:00", "Africa/Porto-Novo"),
    AFRICA_TUNIS("+01:00", "Africa/Tunis"),
    AFRICA_WINDHOEK("+01:00", "Africa/Windhoek"),
    CET("+01:00", "CET"),
    ETC_GMT_MINUS_1("+01:00", "Etc/GMT-1"),
    EUROPE_AMSTERDAM("+01:00", "Europe/Amsterdam"),
    EUROPE_ANDORRA("+01:00", "Europe/Andorra"),
    EUROPE_BELGRADE("+01:00", "Europe/Belgrade"),
    EUROPE_BERLIN("+01:00", "Europe/Berlin"),
    EUROPE_BRUSSELS("+01:00", "Europe/Brussels"),
    EUROPE_BUDAPEST("+01:00", "Europe/Budapest"),
    EUROPE_COPENHAGEN("+01:00", "Europe/Copenhagen"),
    EUROPE_GIBRALTAR("+01:00", "Europe/Gibraltar"),
    EUROPE_LUXEMBOURG("+01:00", "Europe/Luxembourg"),
    EUROPE_MADRID("+01:00", "Europe/Madrid"),
    EUROPE_MALTA("+01:00", "Europe/Malta"),
    EUROPE_MONACO("+01:00", "Europe/Monaco"),
    EUROPE_OSLO("+01:00", "Europe/Oslo"),
    EUROPE_PARIS("+01:00", "Europe/Paris"),
    EUROPE_PRAGUE("+01:00", "Europe/Prague"),
    EUROPE_ROME("+01:00", "Europe/Rome"),
    EUROPE_STOCKHOLM("+01:00", "Europe/Stockholm"),
    EUROPE_TIRANE("+01:00", "Europe/Tirane"),
    EUROPE_VADUZ("+01:00", "Europe/Vaduz"),
    EUROPE_VIENNA("+01:00", "Europe/Vienna"),
    EUROPE_WARSAW("+01:00", "Europe/Warsaw"),
    EUROPE_ZURICH("+01:00", "Europe/Zurich"),
    MET("+01:00", "MET"),
    AFRICA_BLANTYRE("+02:00", "Africa/Blantyre"),
    AFRICA_BUJUMBURA("+02:00", "Africa/Bujumbura"),
    AFRICA_CAIRO("+02:00", "Africa/Cairo"),
    AFRICA_GABORONE("+02:00", "Africa/Gaborone"),
    AFRICA_HARARE("+02:00", "Africa/Harare"),
    AFRICA_JOHANNESBURG("+02:00", "Africa/Johannesburg"),
    AFRICA_KIGALI("+02:00", "Africa/Kigali"),
    AFRICA_LUBUMBASHI("+02:00", "Africa/Lubumbashi"),
    AFRICA_LUSAKA("+02:00", "Africa/Lusaka"),
    AFRICA_MAPUTO("+02:00", "Africa/Maputo"),
    AFRICA_MASERU("+02:00", "Africa/Maseru"),
    AFRICA_MBABANE("+02:00", "Africa/Mbabane"),
    AFRICA_TRIPOLI("+02:00", "Africa/Tripoli"),
    ASIA_AMMAN("+02:00", "Asia/Amman"),
    ASIA_BEIRUT("+02:00", "Asia/Beirut"),
    ASIA_DAMASCUS("+02:00", "Asia/Damascus"),
    ASIA_GAZA("+02:00", "Asia/Gaza"),
    ASIA_JERUSALEM("+02:00", "Asia/Jerusalem"),
    ASIA_NICOSIA("+02:00", "Asia/Nicosia"),
    EET("+02:00", "EET"),
    ETC_GMT_MINUS_2("+02:00", "Etc/GMT-2"),
    EUROPE_ATHENS("+02:00", "Europe/Athens"),
    EUROPE_BUCHAREST("+02:00", "Europe/Bucharest"),
    EUROPE_CHISINAU("+02:00", "Europe/Chisinau"),
    EUROPE_HELSINKI("+02:00", "Europe/Helsinki"),
    EUROPE_ISTANBUL("+02:00", "Europe/Istanbul"),
    EUROPE_KALININGRAD("+02:00", "Europe/Kaliningrad"),
    EUROPE_KIEV("+02:00", "Europe/Kiev"),
    EUROPE_MINSK("+02:00", "Europe/Minsk"),
    EUROPE_RIGA("+02:00", "Europe/Riga"),
    EUROPE_SIMFEROPOL("+02:00", "Europe/Simferopol"),
    EUROPE_SOFIA("+02:00", "Europe/Sofia"),
    EUROPE_TALLINN("+02:00", "Europe/Tallinn"),
    EUROPE_UZHGOROD("+02:00", "Europe/Uzhgorod"),
    EUROPE_VILNIUS("+02:00", "Europe/Vilnius"),
    EUROPE_ZAPOROZHYE("+02:00", "Europe/Zaporozhye"),
    AFRICA_ADDIS_ABABA("+03:00", "Africa/Addis_Ababa"),
    AFRICA_ASMARA("+03:00", "Africa/Asmara"),
    AFRICA_DAR_ES_SALAAM("+03:00", "Africa/Dar_es_Salaam"),
    AFRICA_DJIBOUTI("+03:00", "Africa/Djibouti"),
    AFRICA_KAMPALA("+03:00", "Africa/Kampala"),
    AFRICA_KHARTOUM("+03:00", "Africa/Khartoum"),
    AFRICA_MOGADISHU("+03:00", "Africa/Mogadishu"),
    AFRICA_NAIROBI("+03:00", "Africa/Nairobi"),
    ANTARCTICA_SYOWA("+03:00", "Antarctica/Syowa"),
    ASIA_ADEN("+03:00", "Asia/Aden"),
    ASIA_BAGHDAD("+03:00", "Asia/Baghdad"),
    ASIA_BAHRAIN("+03:00", "Asia/Bahrain"),
    ASIA_KUWAIT("+03:00", "Asia/Kuwait"),
    ASIA_QATAR("+03:00", "Asia/Qatar"),
    ASIA_RIYADH("+03:00", "Asia/Riyadh"),
    ETC_GMT_MINUS_3("+03:00", "Etc/GMT-3"),
    EUROPE_MOSCOW("+03:00", "Europe/Moscow"),
    EUROPE_SAMARA("+03:00", "Europe/Samara"),
    EUROPE_VOLGOGRAD("+03:00", "Europe/Volgograd"),
    INDIAN_ANTANANARIVO("+03:00", "Indian/Antananarivo"),
    INDIAN_COMORO("+03:00", "Indian/Comoro"),
    INDIAN_MAYOTTE("+03:00", "Indian/Mayotte"),
    ASIA_TEHRAN("+03:30", "Asia/Tehran"),
    ASIA_BAKU("+04:00", "Asia/Baku"),
    ASIA_DUBAI("+04:00", "Asia/Dubai"),
    ASIA_MUSCAT("+04:00", "Asia/Muscat"),
    ASIA_TBILISI("+04:00", "Asia/Tbilisi"),
    ASIA_YEREVAN("+04:00", "Asia/Yerevan"),
    ETC_GMT_MINUS_4("+04:00", "Etc/GMT-4"),
    INDIAN_MAHE("+04:00", "Indian/Mahe"),
    INDIAN_MAURITIUS("+04:00", "Indian/Mauritius"),
    INDIAN_REUNION("+04:00", "Indian/Reunion"),
    ASIA_KABUL("+04:30", "Asia/Kabul"),
    ANTARCTICA_MAWSON("+05:00", "Antarctica/Mawson"),
    ASIA_AQTAU("+05:00", "Asia/Aqtau"),
    ASIA_AQTOBE("+05:00", "Asia/Aqtobe"),
    ASIA_ASHGABAT("+05:00", "Asia/Ashgabat"),
    ASIA_DUSHANBE("+05:00", "Asia/Dushanbe"),
    ASIA_KARACHI("+05:00", "Asia/Karachi"),
    ASIA_ORAL("+05:00", "Asia/Oral"),
    ASIA_SAMARKAND("+05:00", "Asia/Samarkand"),
    ASIA_TASHKENT("+05:00", "Asia/Tashkent"),
    ASIA_YEKATERINBURG("+05:00", "Asia/Yekaterinburg"),
    ETC_GMT_MINUS_5("+05:00", "Etc/GMT-5"),
    INDIAN_KERGUELEN("+05:00", "Indian/Kerguelen"),
    INDIAN_MALDIVES("+05:00", "Indian/Maldives"),
    ASIA_COLOMBO("+05:30", "Asia/Colombo"),
    ASIA_KOLKATA("+05:30", "Asia/Kolkata"),
    ASIA_KATHMANDU("+05:45", "Asia/Kathmandu"),
    ANTARCTICA_VOSTOK("+06:00", "Antarctica/Vostok"),
    ASIA_ALMATY("+06:00", "Asia/Almaty"),
    ASIA_BISHKEK("+06:00", "Asia/Bishkek"),
    ASIA_DHAKA("+06:00", "Asia/Dhaka"),
    ASIA_NOVOKUZNETSK("+06:00", "Asia/Novokuznetsk"),
    ASIA_NOVOSIBIRSK("+06:00", "Asia/Novosibirsk"),
    ASIA_OMSK("+06:00", "Asia/Omsk"),
    ASIA_QYZYLORDA("+06:00", "Asia/Qyzylorda"),
    ASIA_THIMPHU("+06:00", "Asia/Thimphu"),
    ETC_GMT_MINUS_6("+06:00", "Etc/GMT-6"),
    INDIAN_CHAGOS("+06:00", "Indian/Chagos"),
    ASIA_RANGOON("+06:30", "Asia/Rangoon"),
    INDIAN_COCOS("+06:30", "Indian/Cocos"),
    ANTARCTICA_DAVIS("+07:00", "Antarctica/Davis"),
    ASIA_BANGKOK("+07:00", "Asia/Bangkok"),
    ASIA_HO_CHI_MINH("+07:00", "Asia/Ho_Chi_Minh"),
    ASIA_HOVD("+07:00", "Asia/Hovd"),
    ASIA_JAKARTA("+07:00", "Asia/Jakarta"),
    ASIA_KRASNOYARSK("+07:00", "Asia/Krasnoyarsk"),
    ASIA_PHNOM_PENH("+07:00", "Asia/Phnom_Penh"),
    ASIA_PONTIANAK("+07:00", "Asia/Pontianak"),
    ASIA_VIENTIANE("+07:00", "Asia/Vientiane"),
    ETC_GMT_MINUS_7("+07:00", "Etc/GMT-7"),
    INDIAN_CHRISTMAS("+07:00", "Indian/Christmas"),
    ANTARCTICA_CASEY("+08:00", "Antarctica/Casey"),
    ASIA_BRUNEI("+08:00", "Asia/Brunei"),
    ASIA_CHOIBALSAN("+08:00", "Asia/Choibalsan"),
    ASIA_CHONGQING("+08:00", "Asia/Chongqing"),
    ASIA_HARBIN("+08:00", "Asia/Harbin"),
    ASIA_HONG_KONG("+08:00", "Asia/Hong_Kong"),
    ASIA_IRKUTSK("+08:00", "Asia/Irkutsk"),
    ASIA_KASHGAR("+08:00", "Asia/Kashgar"),
    ASIA_KUALA_LUMPUR("+08:00", "Asia/Kuala_Lumpur"),
    ASIA_KUCHING("+08:00", "Asia/Kuching"),
    ASIA_MACAU("+08:00", "Asia/Macau"),
    ASIA_MAKASSAR("+08:00", "Asia/Makassar"),
    ASIA_MANILA("+08:00", "Asia/Manila"),
    ASIA_SHANGHAI("+08:00", "Asia/Shanghai"),
    ASIA_SINGAPORE("+08:00", "Asia/Singapore"),
    ASIA_TAIPEI("+08:00", "Asia/Taipei"),
    ASIA_ULAANBAATAR("+08:00", "Asia/Ulaanbaatar"),
    ASIA_URUMQI("+08:00", "Asia/Urumqi"),
    AUSTRALIA_PERTH("+08:00", "Australia/Perth"),
    ETC_GMT_MINUS_8("+08:00", "Etc/GMT-8"),
    AUSTRALIA_EUCLA("+08:45", "Australia/Eucla"),
    ASIA_DILI("+09:00", "Asia/Dili"),
    ASIA_JAYAPURA("+09:00", "Asia/Jayapura"),
    ASIA_PYONGYANG("+09:00", "Asia/Pyongyang"),
    ASIA_SEOUL("+09:00", "Asia/Seoul"),
    ASIA_TOKYO("+09:00", "Asia/Tokyo"),
    ASIA_YAKUTSK("+09:00", "Asia/Yakutsk"),
    ETC_GMT_MINUS_9("+09:00", "Etc/GMT-9"),
    PACIFIC_PALAU("+09:00", "Pacific/Palau"),
    AUSTRALIA_ADELAIDE("+09:30", "Australia/Adelaide"),
    AUSTRALIA_BROKEN_HILL("+09:30", "Australia/Broken_Hill"),
    AUSTRALIA_DARWIN("+09:30", "Australia/Darwin"),
    ANTARCTICA_DUMONTDURVILLE("+10:00", "Antarctica/DumontDUrville"),
    ASIA_SAKHALIN("+10:00", "Asia/Sakhalin"),
    ASIA_VLADIVOSTOK("+10:00", "Asia/Vladivostok"),
    AUSTRALIA_BRISBANE("+10:00", "Australia/Brisbane"),
    AUSTRALIA_CURRIE("+10:00", "Australia/Currie"),
    AUSTRALIA_HOBART("+10:00", "Australia/Hobart"),
    AUSTRALIA_LINDEMAN("+10:00", "Australia/Lindeman"),
    AUSTRALIA_MELBOURNE("+10:00", "Australia/Melbourne"),
    AUSTRALIA_SYDNEY("+10:00", "Australia/Sydney"),
    ETC_GMT_MINUS_10("+10:00", "Etc/GMT-10"),
    PACIFIC_CHUUK("+10:00", "Pacific/Chuuk"),
    PACIFIC_GUAM("+10:00", "Pacific/Guam"),
    PACIFIC_PORT_MORESBY("+10:00", "Pacific/Port_Moresby"),
    PACIFIC_SAIPAN("+10:00", "Pacific/Saipan"),
    AUSTRALIA_LORD_HOWE("+10:30", "Australia/Lord_Howe"),
    ANTARCTICA_MACQUARIE("+11:00", "Antarctica/Macquarie"),
    ASIA_ANADYR("+11:00", "Asia/Anadyr"),
    ASIA_KAMCHATKA("+11:00", "Asia/Kamchatka"),
    ASIA_MAGADAN("+11:00", "Asia/Magadan"),
    ETC_GMT_MINUS_11("+11:00", "Etc/GMT-11"),
    PACIFIC_EFATE("+11:00", "Pacific/Efate"),
    PACIFIC_GUADALCANAL("+11:00", "Pacific/Guadalcanal"),
    PACIFIC_KOSRAE("+11:00", "Pacific/Kosrae"),
    PACIFIC_NOUMEA("+11:00", "Pacific/Noumea"),
    PACIFIC_POHNPEI("+11:00", "Pacific/Pohnpei"),
    PACIFIC_NORFOLK("+11:30", "Pacific/Norfolk"),
    ANTARCTICA_MCMURDO("+12:00", "Antarctica/McMurdo"),
    ETC_GMT_MINUS_12("+12:00", "Etc/GMT-12"),
    PACIFIC_AUCKLAND("+12:00", "Pacific/Auckland"),
    PACIFIC_FIJI("+12:00", "Pacific/Fiji"),
    PACIFIC_FUNAFUTI("+12:00", "Pacific/Funafuti"),
    PACIFIC_KWAJALEIN("+12:00", "Pacific/Kwajalein"),
    PACIFIC_MAJURO("+12:00", "Pacific/Majuro"),
    PACIFIC_NAURU("+12:00", "Pacific/Nauru"),
    PACIFIC_TARAWA("+12:00", "Pacific/Tarawa"),
    PACIFIC_WAKE("+12:00", "Pacific/Wake"),
    PACIFIC_WALLIS("+12:00", "Pacific/Wallis"),
    PACIFIC_CHATHAM("+12:45", "Pacific/Chatham"),
    ETC_GMT_MINUS_13("+13:00", "Etc/GMT-13"),
    PACIFIC_ENDERBURY("+13:00", "Pacific/Enderbury"),
    PACIFIC_TONGATAPU("+13:00", "Pacific/Tongatapu"),
    ETC_GMT_MINUS_14("+14:00", "Etc/GMT-14"),
    PACIFIC_KIRITIMATI("+14:00", "Pacific/Kiritimati");

    private final String offset;
    private final String zoneId;

    private TimeZoneId(String offset, String zoneId) {
        this.offset = offset;
        this.zoneId = zoneId;
    }

    public static TimeZoneId getTimeZoneTable(String zoneId) {
        return (TimeZoneId) Arrays.stream(values()).filter((value) -> {
            return value.getZoneId().equalsIgnoreCase(zoneId);
        }).findFirst().orElse(null);
    }

    public String getOffset() {
        return this.offset;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public ZoneId toZoneId() {
        return ZoneId.of(this.zoneId);
    }

    public static TimeZoneId getZoneIdFromLocale(Locale locale) {
        if (locale == null || locale.getCountry().isEmpty()) {
            return UTC; // Default fallback
        }

        String countryCode = locale.getCountry();

        return switch (countryCode) {
            case "US" -> AMERICA_NEW_YORK;
            case "CA" -> AMERICA_TORONTO;
            case "MX" -> AMERICA_MEXICO_CITY;
            case "BR" -> AMERICA_SAO_PAULO;
            case "AR" -> AMERICA_ARGENTINA_BUENOS_AIRES;
            case "GB" -> EUROPE_LONDON;
            case "FR" -> EUROPE_PARIS;
            case "DE" -> EUROPE_BERLIN;
            case "IT" -> EUROPE_ROME;
            case "ES" -> EUROPE_MADRID;
            case "RU" -> EUROPE_MOSCOW;
            case "IN" -> ASIA_KOLKATA;
            case "CN" -> ASIA_SHANGHAI;
            case "JP" -> ASIA_TOKYO;
            case "KR" -> ASIA_SEOUL;
            case "AU" -> AUSTRALIA_SYDNEY;
            case "NZ" -> PACIFIC_AUCKLAND;
            case "ZA" -> AFRICA_JOHANNESBURG;
            case "EG" -> AFRICA_CAIRO;
            case "NG" -> AFRICA_LAGOS;
            case "SA" -> ASIA_RIYADH;
            case "AE" -> ASIA_DUBAI;
            case "IR" -> ASIA_TEHRAN;
            case "PK" -> ASIA_KARACHI;
            case "BD" -> ASIA_DHAKA;
            case "ID" -> ASIA_JAKARTA;
            case "TH" -> ASIA_BANGKOK;
            case "VN" -> ASIA_HO_CHI_MINH;
            case "MY" -> ASIA_KUALA_LUMPUR;
            case "SG" -> ASIA_SINGAPORE;
            case "PH" -> ASIA_MANILA;
            case "HK" -> ASIA_HONG_KONG;
            case "TW" -> ASIA_TAIPEI;
            case "IL" -> ASIA_JERUSALEM;
            case "TR" -> EUROPE_ISTANBUL;
            case "GR" -> EUROPE_ATHENS;
            case "PT" -> EUROPE_LISBON;
            case "PL" -> EUROPE_WARSAW;
            case "NL" -> EUROPE_AMSTERDAM;
            case "SE" -> EUROPE_STOCKHOLM;
            case "NO" -> EUROPE_OSLO;
            case "FI" -> EUROPE_HELSINKI;
            case "DK" -> EUROPE_COPENHAGEN;
            case "IS" -> ATLANTIC_REYKJAVIK;
            case "CL" -> AMERICA_SANTIAGO;
            case "CO" -> AMERICA_BOGOTA;
            case "VE" -> AMERICA_CARACAS;
            case "PE" -> AMERICA_LIMA;
            case "CU" -> AMERICA_HAVANA;
            case "JM" -> AMERICA_JAMAICA;
            case "DO" -> AMERICA_SANTO_DOMINGO;
            case "PR" -> AMERICA_PUERTO_RICO;
            case "BZ" -> AMERICA_BELIZE;
            case "GT" -> AMERICA_GUATEMALA;
            case "HN" -> AMERICA_TEGUCIGALPA;
            case "CR" -> AMERICA_COSTA_RICA;
            case "PA" -> AMERICA_PANAMA;
            case "UY" -> AMERICA_MONTEVIDEO;
            case "PY" -> AMERICA_ASUNCION;
            case "BO" -> AMERICA_LA_PAZ;
            case "EC" -> AMERICA_GUAYAQUIL;
            case "SR" -> AMERICA_PARAMARIBO;
            case "AR-CATAMARCA" -> AMERICA_ARGENTINA_CATAMARCA;
            case "AR-CORDOBA" -> AMERICA_ARGENTINA_CORDOBA;
            case "AR-JUJUY" -> AMERICA_ARGENTINA_JUJUY;
            case "AR-LA_RIOJA" -> AMERICA_ARGENTINA_LA_RIOJA;
            case "AR-MENDOZA" -> AMERICA_ARGENTINA_MENDOZA;
            case "AR-RIO_GALLEGOS" -> AMERICA_ARGENTINA_RIO_GALLEGOS;
            case "AR-SALTA" -> AMERICA_ARGENTINA_SALTA;
            case "AR-SAN_JUAN" -> AMERICA_ARGENTINA_SAN_JUAN;
            case "AR-TUCUMAN" -> AMERICA_ARGENTINA_TUCUMAN;
            case "AR-USHUAIA" -> AMERICA_ARGENTINA_USHUAIA;
            case "BR-BAHIA" -> AMERICA_BAHIA;
            case "BR-BELEM" -> AMERICA_BELEM;
            case "BR-CAYENNE" -> AMERICA_CAYENNE;
            case "BR-FORTALEZA" -> AMERICA_FORTALEZA;
            case "BR-GODTHAB" -> AMERICA_GODTHAB;
            case "BR-MACEIO" -> AMERICA_MACEIO;
            case "BR-MIQUELON" -> AMERICA_MIQUELON;
            case "BR-MONTEVIDEO" -> AMERICA_MONTEVIDEO;
            case "BR-PARAMARIBO" -> AMERICA_PARAMARIBO;
            case "BR-RECIFE" -> AMERICA_RECIFE;
            case "BR-SANTAREM" -> AMERICA_SANTAREM;
            case "BR-SAO_PAULO" -> AMERICA_SAO_PAULO;
            case "ROTHERA" -> ANTARCTICA_ROTHERA;
            case "ETC_GMT_PLUS_3" -> ETC_GMT_PLUS_3;
            case "BR-NORONHA" -> AMERICA_NORONHA;
            case "ATLANTIC_SOUTH_GEORGIA" -> ATLANTIC_SOUTH_GEORGIA;
            case "ETC_GMT_PLUS_2" -> ETC_GMT_PLUS_2;
            case "SCORESBYSUND" -> AMERICA_SCORESBYSUND;
            case "AZORES" -> ATLANTIC_AZORES;
            case "CAPE_VERDE" -> ATLANTIC_CAPE_VERDE;
            case "ETC_GMT_PLUS_1" -> ETC_GMT_PLUS_1;
            case "AFRICA_ABIDJAN" -> AFRICA_ABIDJAN;
            case "AFRICA_ACCRA" -> AFRICA_ACCRA;
            case "AFRICA_BAMAKO" -> AFRICA_BAMAKO;
            case "AFRICA_BANJUL" -> AFRICA_BANJUL;
            case "AFRICA_BISSAU" -> AFRICA_BISSAU;
            case "AFRICA_CASABLANCA" -> AFRICA_CASABLANCA;
            case "AFRICA_CONAKRY" -> AFRICA_CONAKRY;
            case "AFRICA_DAKAR" -> AFRICA_DAKAR;
            case "AFRICA_EL_AAIUN" -> AFRICA_EL_AAIUN;
            case "AFRICA_FREETOWN" -> AFRICA_FREETOWN;
            case "EUROPE_DUBLIN" -> EUROPE_DUBLIN;
            case "EUROPE_LISBON" -> EUROPE_LISBON;
            case "EUROPE_LONDON" -> EUROPE_LONDON;
            case "ASIA_THIMPHU" -> ASIA_THIMPHU;
            case "ETC_GMT_MINUS_6" -> ETC_GMT_MINUS_6;
            case "INDIAN_CHAGOS" -> INDIAN_CHAGOS;
            case "ASIA_RANGOON" -> ASIA_RANGOON;
            case "INDIAN_COCOS" -> INDIAN_COCOS;
            case "ANTARCTICA_DAVIS" -> ANTARCTICA_DAVIS;
            case "ASIA_BANGKOK" -> ASIA_BANGKOK;
            case "ASIA_HO_CHI_MINH" -> ASIA_HO_CHI_MINH;
            case "ASIA_HOVD" -> ASIA_HOVD;
            case "ASIA_JAKARTA" -> ASIA_JAKARTA;
            case "ASIA_KRASNOYARSK" -> ASIA_KRASNOYARSK;
            case "ASIA_PHNOM_PENH" -> ASIA_PHNOM_PENH;
            case "ASIA_PONTIANAK" -> ASIA_PONTIANAK;
            case "ASIA_VIENTIANE" -> ASIA_VIENTIANE;
            case "ETC_GMT_MINUS_7" -> ETC_GMT_MINUS_7;
            case "INDIAN_CHRISTMAS" -> INDIAN_CHRISTMAS;
            case "ANTARCTICA_CASEY" -> ANTARCTICA_CASEY;
            case "ASIA_BRUNEI" -> ASIA_BRUNEI;
            case "ASIA_CHOIBALSAN" -> ASIA_CHOIBALSAN;
            case "ASIA_CHONGQING" -> ASIA_CHONGQING;
            case "ASIA_HARBIN" -> ASIA_HARBIN;
            case "ASIA_HONG_KONG" -> ASIA_HONG_KONG;
            case "ASIA_IRKUTSK" -> ASIA_IRKUTSK;
            case "ASIA_KASHGAR" -> ASIA_KASHGAR;
            case "ASIA_KUALA_LUMPUR" -> ASIA_KUALA_LUMPUR;
            case "ASIA_KUCHING" -> ASIA_KUCHING;
            case "ASIA_MACAU" -> ASIA_MACAU;
            case "ASIA_MAKASSAR" -> ASIA_MAKASSAR;
            case "ASIA_MANILA" -> ASIA_MANILA;
            case "ASIA_SHANGHAI" -> ASIA_SHANGHAI;
            case "ASIA_SINGAPORE" -> ASIA_SINGAPORE;
            case "ASIA_TAIPEI" -> ASIA_TAIPEI;
            case "ASIA_ULAANBAATAR" -> ASIA_ULAANBAATAR;
            case "UTC" -> UTC;
            // Add further cases as necessary
            default -> UTC;
        };
    }

}
