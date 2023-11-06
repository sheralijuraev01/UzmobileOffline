package uz.sher.uzmobile.data

import uz.sher.uzmobile.model.Banner


class BannerData {
    private val dataBannerList: MutableList<Banner> = ArrayList()

    fun getBannerData(): MutableList<Banner> {
        dataBannerList.clear()
        dataBannerList.add(
                Banner(
                    "Prosta 10",
                    "10 MIN",
                    "10 MB",
                    "10 SMS",
                    "Oyiga 10 000 so'm",
                    "Tarif Oddiy 10",
                    "10 000 so'm",
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum",

                )
                )

        dataBannerList.add(
            Banner(
                "Zo'r 20",
                "20 MIN",
                "20 MB",
                "20 SMS",
                "Oyiga 20 000 so'm",
                "Tarif Zo'r 20",
                "20 000 so'm",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum",

            )
        )
        dataBannerList.add(
            Banner(
                "Zo'r 30",
                "30 MIN",
                "30 MB",
                "30 SMS",
                "Oyiga 30 000 so'm",
                "Tarif Zo'r 30",
                "30 000 so'm",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum",

            )
        )
        return dataBannerList
    }
}