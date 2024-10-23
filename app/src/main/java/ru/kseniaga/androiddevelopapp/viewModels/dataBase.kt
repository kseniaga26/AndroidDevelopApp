package ru.kseniaga.androiddevelopapp.viewModels

import ru.kseniaga.androiddevelopapp.models.Title

fun getDataBase(): List<Title> {
    val animeTitleList = listOf(
        Title(
            id = 12345,
            title_english = "Bakemonogatari",
            title_japanese = "化物語",
            year = 2009,
            type = "TV",
            imageUrl = "https://nyaa.shikimori.one/uploads/poster/animes/5081/c66dc721a0cd98127ca1c38a2290f5e1.jpeg",
            episodes = 15,
            status = "finished",
            rating = "R-17",
            score = 8.3,
            studios = "SHAFT",
            genres = "Тайна, Романтика, Сверхъестественное",
            description = "История о Коёми Арараги, ученике третьего класса старшей школы и бывшем вампире.\n" +
                    "\n" +
                    "Однажды он шёл по школьной лестнице, а сверху на него упала девушка. Впрочем, падала она медленно, да и вес её оказался странным, всего несколько килограмм. Приготовившийся было к сильному удару, Коёми с лёгкостью ловит её на руки. Девушка оказалась одноклассницей Арараги, Хитаги Сэндзёгахарой, красивой, но, на первый взгляд, застенчивой и абсолютно нелюдимой — за три года совместной учёбы они ни разу не разговаривали. И это касается не только Коёми — последние годы девушка не общалась ни с кем. Характер у неё, как оказалось, вовсе не застенчивый, и, на свою беду, Арараги об этом вскоре узнаёт, ведь Хитаги совсем не хочет, чтобы кто-то узнал о её секрете. А секрет заключается в её весе, который украло божество веса, предстающее в образе огромного краба. Коёми признаётся, что в прошлом сам пострадал от нападения сверхъестественного существа и по итогу превратился в вампира, однако его знакомый, Мэмэ Осино, помог ему снова стать человеком. Возможно, Мэмэ сможет помочь и ей..."
        ),
        Title(
            id = 23456,
            title_english = "Monogatari",
            title_japanese = "Monogatari",
            year = 2,
            type = "Monogatari",
            imageUrl = "https://nyaa.shikimori.one/uploads/poster/animes/57864/725a1fff95f1a23fc59a93bf7a7c9b56.jpeg",
            episodes = 2,
            status = "Monogatari",
            rating = "Monogatari",
            score = 7.0,
            studios = "Monogatari",
            genres = "Monogatari",
            description = ""
        ),
        Title(
            id = 34567,
            title_english = "Spice and Wolf",
            title_japanese = " 狼と香辛料",
            year = 2010,
            type = "TV",
            imageUrl = "https://nyaa.shikimori.one/uploads/poster/animes/2966/cd9f0c3ce5f71e109d8971e23d109505.jpeg",
            episodes = 26,
            status = "finished",
            rating = "PG-13",
            score = 8.2,
            studios = "Imagine",
            genres = " Приключения, Драма, Фэнтези, Романтика",
            description = "Торговец Крафт Лоуренс странствует по миру, зарабатывая деньги ради давней мечты — осесть в каком-нибудь городе и открыть собственный магазин. Уезжая из очередной деревни с грузом пшеницы, в своей повозке он обнаруживает спящую в колосьях прекрасную девушку. Выглядит она по меньшей мере необычно: полностью обнажённая, однако с пушистым хвостом и волчьими ушками. Проснувшись, та рассказывает Лоуренсу, что местные жители столетиями считают её богиней плодородия, делают подношения, а праздник урожая посвящают ей. Впрочем, сама она себя богиней не считает, и зовут её Холо. В последнее же время с развитием сельского хозяйства сельчане перестали зависеть от её помощи, сохранив лишь традицию, но не более. Холо решила отправиться на родину, в северные земли, и просит Лоуренса доставить её туда, посулив, что в накладе тот не останется. Хорошо всё обдумав, Лоуренс соглашается..."
        ),
        Title(
            id = 41156,
            title_english = "Mushi-Shi",
            title_japanese = "Mushi-Shi",
            year = 2,
            type = "",
            imageUrl = "https://nyaa.shikimori.one/uploads/poster/animes/457/66a349bee619ecb47f270b7024216365.jpeg",
            episodes = 2,
            status = "",
            rating = "",
            score = 7.0,
            studios = "",
            genres = "",
            description = ""
        ),
        Title(
            id = 4,
            title_english = "Violet Evergarden",
            title_japanese = "Naruto",
            year = 2,
            type = "Naruto",
            imageUrl = "https://nyaa.shikimori.one/uploads/poster/animes/33352/4be98a6af5e313a74ab53412a69c5fb7.jpeg",
            episodes = 2,
            status = "Masashi Kishimoto",
            rating = "Masashi Kishimoto",
            score = 7.6,
            studios = "Naruto",
            genres = "Naruto",
            description = ""
        ),
        Title(
            id = 4,
            title_english = "Frieren",
            title_japanese = "Naruto",
            year = 2,
            type = "Naruto",
            imageUrl = "https://nyaa.shikimori.one/uploads/poster/animes/52991/dc841cc9fce2aa1e9907a4b61c5d1d92.jpeg",
            episodes = 2,
            status = "Masashi Kishimoto",
            rating = "Masashi Kishimoto",
            score = 7.6,
            studios = "Naruto",
            genres = "Naruto",
            description = ""
        ),
        Title(
            id = 4,
            title_english = "Natsume's Book of Friends",
            title_japanese = "Naruto",
            year = 2,
            type = "Naruto",
            imageUrl = "https://nyaa.shikimori.one/uploads/poster/animes/32983/51064590ef71edca20a99aa02a1dd62e.jpeg",
            episodes = 2,
            status = "Masashi Kishimoto",
            rating = "Masashi Kishimoto",
            score = 8.1,
            studios = "Naruto",
            genres = "Naruto",
            description = ""
        ),
        Title(
            id = 4,
            title_english = "March comes in like a lion",
            title_japanese = "Naruto",
            year = 2,
            type = "Naruto",
            imageUrl = "https://nyaa.shikimori.one/uploads/poster/animes/31646/4b3cc9914808d9f786c85c7a694525d8.jpeg",
            episodes = 2,
            status = "Masashi Kishimoto",
            rating = "Masashi Kishimoto",
            score = 7.0,
            studios = "Naruto",
            genres = "Naruto",
            description = ""
        ),

    )
    return animeTitleList
}
