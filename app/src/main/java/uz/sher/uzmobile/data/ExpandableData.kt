package uz.sher.uzmobile.data

import uz.sher.uzmobile.model.ExpandableChildTitle
import uz.sher.uzmobile.model.ExpandableTitle

class ExpandableData {
    private val dataItemList :MutableList<ExpandableTitle> = ArrayList()
    private  val list:MutableList<ExpandableChildTitle> =ArrayList()
    private val datachildItemList :MutableList<MutableList<ExpandableChildTitle>> = ArrayList()


  fun getInternetDailyData():MutableList<ExpandableTitle>{

      dataItemList.clear()
      dataItemList.add(ExpandableTitle("50","50 MB Kunlik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
      dataItemList.add(ExpandableTitle("50","50 MB Kunlik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
      dataItemList.add(ExpandableTitle("50","50 MB Kunlik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
      dataItemList.add(ExpandableTitle("50","50 MB Kunlik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
      dataItemList.add(ExpandableTitle("50","50 MB Kunlik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
      dataItemList.add(ExpandableTitle("50","50 MB Kunlik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
      dataItemList.add(ExpandableTitle("50","50 MB Kunlik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
      dataItemList.add(ExpandableTitle("50","50 MB Kunlik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
      dataItemList.add(ExpandableTitle("50","50 MB Kunlik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
      dataItemList.add(ExpandableTitle("50","50 MB Kunlik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
      dataItemList.add(ExpandableTitle("50","50 MB Kunlik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))

    return dataItemList
  }
  fun getInternetChildDailyData():MutableList<MutableList<ExpandableChildTitle>>{
      datachildItemList.clear()
      list.clear()
      list.add(ExpandableChildTitle("Ulanish"))
      datachildItemList.add(list)
      datachildItemList.add(list)
      datachildItemList.add(list)
      datachildItemList.add(list)
      datachildItemList.add(list)
      datachildItemList.add(list)
      datachildItemList.add(list)
      datachildItemList.add(list)
      datachildItemList.add(list)
      datachildItemList.add(list)
      datachildItemList.add(list)

      return datachildItemList

  }

    fun getInternetMonthlyData():MutableList<ExpandableTitle>{

        dataItemList.clear()
        dataItemList.add(ExpandableTitle("50","50 MB Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))

        return dataItemList
    }
    fun getInternetChildWeeklyData():MutableList<MutableList<ExpandableChildTitle>>{
        datachildItemList.clear()
        list.clear()
        list.add(ExpandableChildTitle("Ulanish"))
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)

        return datachildItemList

    }

    fun getInternetWeeklyData():MutableList<ExpandableTitle>{

        dataItemList.clear()
        dataItemList.add(ExpandableTitle("50","50 MB Haftalik", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("100","100 MB Haftalik", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("200","200 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("300","300 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("150","150 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("2GB","2GB MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("3GB","3GB MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("5GB","5GB MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))

        return dataItemList
    }
    fun getInternetChildMonthlyData():MutableList<MutableList<ExpandableChildTitle>>{
        datachildItemList.clear()
        list.clear()
        list.add(ExpandableChildTitle("Ulanish"))
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)

        return datachildItemList

    }

    fun getMinutDailyData():MutableList<ExpandableTitle>{

        dataItemList.clear()
        dataItemList.add(ExpandableTitle("50","50 minut Kunlik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 minut Kunlik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB minut", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB minut", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB minut", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB minut", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB minut", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB minut", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB minut", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB minut", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB minut", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnikimkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))

        return dataItemList
    }
    fun getMinutChildDailyData():MutableList<MutableList<ExpandableChildTitle>>{
        datachildItemList.clear()
        list.clear()
        list.add(ExpandableChildTitle("Ulanish"))
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)

        return datachildItemList

    }

    fun getMinutMonthlyData():MutableList<ExpandableTitle>{

        dataItemList.clear()
        dataItemList.add(ExpandableTitle("50","50 minut Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 minut Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 minut Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 minut Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 minut Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 minut Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 minut Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 minut Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 minut Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 minut Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))
        dataItemList.add(ExpandableTitle("50","50 minut Oylik", "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",0,false))

        return dataItemList
    }
    fun getMinutChildWeeklyData():MutableList<MutableList<ExpandableChildTitle>>{
        datachildItemList.clear()
        list.clear()
        list.add(ExpandableChildTitle("Ulanish"))
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)

        return datachildItemList

    }

    fun getMinutWeeklyData():MutableList<ExpandableTitle>{

        dataItemList.clear()
        dataItemList.add(ExpandableTitle("50","50 minut Haftalik", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("100","100 minut Haftalik", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("200","200 minut", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("300","300 minut", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("150","150 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("2GB","2GB MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("3GB","3GB MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("5GB","5GB MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))

        return dataItemList
    }
    fun getMinutChildMonthlyData():MutableList<MutableList<ExpandableChildTitle>>{
        datachildItemList.clear()
        list.clear()
        list.add(ExpandableChildTitle("Ulanish"))
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)

        return datachildItemList

    }

    fun getSmsDailyData():MutableList<ExpandableTitle>{

        dataItemList.clear()
        dataItemList.add(ExpandableTitle("50","50 SMS Kunlik", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("100","100 SMS", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("200","200 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("300","300 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("150","150 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("2GB","2GB MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("3GB","3GB MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("5GB","5GB MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))

        return dataItemList
    }
    fun getSmsChildDailyData():MutableList<MutableList<ExpandableChildTitle>>{
        datachildItemList.clear()
        list.clear()
        list.add(ExpandableChildTitle("Ulanish"))
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)

        return datachildItemList

    }

    fun getSmsMonthlyData():MutableList<ExpandableTitle>{

        dataItemList.clear()
        dataItemList.add(ExpandableTitle("50","50 MB Oylik" , "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("100","100 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("200","200 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("300","300 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("150","150 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("2GB","2GB MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("3GB","3GB MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("5GB","5GB MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))

        return dataItemList
    }
    fun getSmsChildWeeklyData():MutableList<MutableList<ExpandableChildTitle>>{
        datachildItemList.clear()
        list.clear()
        list.add(ExpandableChildTitle("Ulanish"))
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)

        return datachildItemList

    }

    fun getSmsWeeklyData():MutableList<ExpandableTitle>{

        dataItemList.clear()
        dataItemList.add(ExpandableTitle("50","50 MB Haftalik" , "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("100","100 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("200","200 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("300","300 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("150","150 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("2GB","2GB MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("3GB","3GB MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("5GB","5GB MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))

        return dataItemList
    }
    fun getSmsChildMonthlyData():MutableList<MutableList<ExpandableChildTitle>>{
        datachildItemList.clear()
        list.clear()
        list.add(ExpandableChildTitle("Ulanish"))
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)

        return datachildItemList

    }

    fun getTarifData():MutableList<ExpandableTitle>{

        dataItemList.clear()
        dataItemList.add(ExpandableTitle("50","50  Tarif" , "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,true))
        dataItemList.add(ExpandableTitle("100","100 Tarif", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,true))
        dataItemList.add(ExpandableTitle("200","200 ", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,true))
        dataItemList.add(ExpandableTitle("300","300 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,true))
        dataItemList.add(ExpandableTitle("150","150 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,true))
        dataItemList.add(ExpandableTitle("2GB","2GB MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,true))
        dataItemList.add(ExpandableTitle("3GB","3GB MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,true))
        dataItemList.add(ExpandableTitle("5GB","5GB MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,true))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,true))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,true))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,true))

        return dataItemList
    }
    fun getTarifChildData():MutableList<MutableList<ExpandableChildTitle>>{
        datachildItemList.clear()
        list.clear()
        list.add(ExpandableChildTitle("Ulanish"))
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)

        return datachildItemList

    }


    fun getServiceData():MutableList<ExpandableTitle>{

        dataItemList.clear()
        dataItemList.add(ExpandableTitle("50","50  Xizmatlar" , "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,true))
        dataItemList.add(ExpandableTitle("100","100 Xizmatlar", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,true))
        dataItemList.add(ExpandableTitle("200","200 Xizmatlar ", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,true))
        dataItemList.add(ExpandableTitle("300","300 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,true))
        dataItemList.add(ExpandableTitle("150","150 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,true))
        dataItemList.add(ExpandableTitle("2GB","2GB MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,true))
        dataItemList.add(ExpandableTitle("3GB","3GB MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,true))
        dataItemList.add(ExpandableTitle("5GB","5GB MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,true))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,true))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,true))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,true))

        return dataItemList
    }
    fun getServiceChildData():MutableList<MutableList<ExpandableChildTitle>>{
        datachildItemList.clear()
        list.clear()
        list.add(ExpandableChildTitle("Ulanish"))
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)

        return datachildItemList

    }

    fun getUssdData():MutableList<ExpandableTitle>{

        dataItemList.clear()
        dataItemList.add(ExpandableTitle("50","50 MB USSD" , "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("100","100 USSD", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("200","200 USSD", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("300","300 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("150","150 MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("2GB","2GB MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("3GB","3GB MB", "Lorem ipsum dolor sit amet,   consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))
        dataItemList.add(ExpandableTitle("5GB","5GB MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut laboreet dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco ",0,false))
        dataItemList.add(ExpandableTitle("50","50 MB", "Lorem ipsum dolor sit amet,  consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation  ullamco ",0,false))

        return dataItemList
    }
    fun getUssdChildData():MutableList<MutableList<ExpandableChildTitle>>{
        datachildItemList.clear()
        list.clear()
        list.add(ExpandableChildTitle("Ulanish"))
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)
        datachildItemList.add(list)

        return datachildItemList

    }





}