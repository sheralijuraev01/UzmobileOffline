package uz.sher.uzmobile.data
import android.provider.Settings.Global.getString
import uz.sher.uzmobile.R
import uz.sher.uzmobile.model.News


class NewsData( ) {
    private val titleList:MutableList<News> =ArrayList()



    fun getTitleData( ):MutableList<News>{
        titleList.clear()
        titleList.add(News("Hurmatli abonentlar!","O‘zbektelekom AK telekommunikatsiya tarmog‘ini modernizatsiya qilish bo‘yicha rejalashtirilgan ishlar munosabati bilan, 2022-yilning 5-noyabr kuni soat 00:00 dan 06:00 gacha Toshkent viloyati Zangiota tumani ATS-974.6 (Nazarbek), ATS-975.9 (Quyoshli) va 975.8 (O‘rtaovul) yo’nalishida ko'rsatilayotgan xizmatlar sifatini oshirishga qaratilgan texnik ishlar olib boriladi.",true))
        titleList.add(News("UZTELECOM mobil aloqa xizmatiga onlayn ulaning!","Uyingiz yoki ofisingizdan chiqmasdan UZTELECOMga ulanmoqchimisiz? Bu oson! Onlayn ulanish xizmatining yangi imkoniyati orqali UZTELECOMning GSM tarmog‘i abonentiga aylaning. Istalgan raqamni tanlab, eSIM texnologiyasi yoki standart SIM-karta yordamida mobil aloqaga ulaning va zaruriyatga qarab muddatli to‘lovni onlayn rasmiylashtiring!",true))
        titleList.add(News("UZTELECOM – Aloqa kubogi-2022 chempioni","“O‘zbektelekom” AK doimiy ravishda o'z xodimlari o‘rtasida sog‘lom turmush tarzini faol targ‘ib qilib boradi va sport Kompaniya xodimlari o'rtasida ommabop hisoblanadi.",false))
        titleList.add(News("Hurmatli abonentlar!","O‘zbektelekom AK telekommunikatsiya tarmog‘ini modernizatsiya qilish bo‘yicha rejalashtirilgan ishlar munosabati bilan, 2022-yilning 5-noyabr kuni soat 00:00 dan 06:00 gacha Toshkent viloyati Zangiota tumani ATS-974.6 (Nazarbek), ATS-975.9 (Quyoshli) va 975.8 (O‘rtaovul) yo’nalishida ko'rsatilayotgan xizmatlar sifatini oshirishga qaratilgan texnik ishlar olib boriladi.",true))
        titleList.add(News("UZTELECOM mobil aloqa xizmatiga onlayn ulaning!","Uyingiz yoki ofisingizdan chiqmasdan UZTELECOMga ulanmoqchimisiz? Bu oson! Onlayn ulanish xizmatining yangi imkoniyati orqali UZTELECOMning GSM tarmog‘i abonentiga aylaning. Istalgan raqamni tanlab, eSIM texnologiyasi yoki standart SIM-karta yordamida mobil aloqaga ulaning va zaruriyatga qarab muddatli to‘lovni onlayn rasmiylashtiring!",true))
        titleList.add(News("UZTELECOM – Aloqa kubogi-2022 chempioni","“O‘zbektelekom” AK doimiy ravishda o'z xodimlari o‘rtasida sog‘lom turmush tarzini faol targ‘ib qilib boradi va sport Kompaniya xodimlari o'rtasida ommabop hisoblanadi.",false))
        titleList.add(News("Hurmatli abonentlar!","O‘zbektelekom AK telekommunikatsiya tarmog‘ini modernizatsiya qilish bo‘yicha rejalashtirilgan ishlar munosabati bilan, 2022-yilning 5-noyabr kuni soat 00:00 dan 06:00 gacha Toshkent viloyati Zangiota tumani ATS-974.6 (Nazarbek), ATS-975.9 (Quyoshli) va 975.8 (O‘rtaovul) yo’nalishida ko'rsatilayotgan xizmatlar sifatini oshirishga qaratilgan texnik ishlar olib boriladi.",true))
        titleList.add(News("UZTELECOM mobil aloqa xizmatiga onlayn ulaning!","Uyingiz yoki ofisingizdan chiqmasdan UZTELECOMga ulanmoqchimisiz? Bu oson! Onlayn ulanish xizmatining yangi imkoniyati orqali UZTELECOMning GSM tarmog‘i abonentiga aylaning. Istalgan raqamni tanlab, eSIM texnologiyasi yoki standart SIM-karta yordamida mobil aloqaga ulaning va zaruriyatga qarab muddatli to‘lovni onlayn rasmiylashtiring!",true))
        titleList.add(News("UZTELECOM – Aloqa kubogi-2022 chempioni","“O‘zbektelekom” AK doimiy ravishda o'z xodimlari o‘rtasida sog‘lom turmush tarzini faol targ‘ib qilib boradi va sport Kompaniya xodimlari o'rtasida ommabop hisoblanadi.",false))
        titleList.add(News("Hurmatli abonentlar!","O‘zbektelekom AK telekommunikatsiya tarmog‘ini modernizatsiya qilish bo‘yicha rejalashtirilgan ishlar munosabati bilan, 2022-yilning 5-noyabr kuni soat 00:00 dan 06:00 gacha Toshkent viloyati Zangiota tumani ATS-974.6 (Nazarbek), ATS-975.9 (Quyoshli) va 975.8 (O‘rtaovul) yo’nalishida ko'rsatilayotgan xizmatlar sifatini oshirishga qaratilgan texnik ishlar olib boriladi.",true))
        titleList.add(News("UZTELECOM mobil aloqa xizmatiga onlayn ulaning!","Uyingiz yoki ofisingizdan chiqmasdan UZTELECOMga ulanmoqchimisiz? Bu oson! Onlayn ulanish xizmatining yangi imkoniyati orqali UZTELECOMning GSM tarmog‘i abonentiga aylaning. Istalgan raqamni tanlab, eSIM texnologiyasi yoki standart SIM-karta yordamida mobil aloqaga ulaning va zaruriyatga qarab muddatli to‘lovni onlayn rasmiylashtiring!",true))
        titleList.add(News("UZTELECOM – Aloqa kubogi-2022 chempioni","“O‘zbektelekom” AK doimiy ravishda o'z xodimlari o‘rtasida sog‘lom turmush tarzini faol targ‘ib qilib boradi va sport Kompaniya xodimlari o'rtasida ommabop hisoblanadi.",false))

        return titleList
    }



}