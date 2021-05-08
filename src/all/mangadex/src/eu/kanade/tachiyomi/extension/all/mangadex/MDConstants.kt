package eu.kanade.tachiyomi.extension.all.mangadex

import java.text.SimpleDateFormat
import java.util.Locale
import java.util.TimeZone

object MDConstants {

    val uuidRegex =
        Regex("[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}")

    val mangaLimit = 25
    val apiUrl = "https://api.mangadex.org"
    val apiMangaUrl = "$apiUrl/manga"
    val atHomePostUrl = "https://api.mangadex.network/report"
    val whitespaceRegex = "\\s".toRegex()

    val tempCover = "https://i.imgur.com/6TrIues.jpg"

    const val mdAtHomeTokenLifespan = 5 * 60 * 1000

    val dateFormatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss+SSS", Locale.US)
        .apply { timeZone = TimeZone.getTimeZone("UTC") }

    const val prefixIdSearch = "id:"

    const val dataSaverPrefTitle = "Data saver"
    const val dataSaverPrefSummary = "Enables smaller more compressed images"
    const val dataSaverPref = "dataSaverV5"

    fun getDataSaverPreferenceKey(dexLang: String): String {
        return "${dataSaverPref}_$dexLang"
    }

    const val standardHttpsPortTitle = "Use HTTPS port 443 only"
    const val standardHttpsPortSummary =
        "Enable to only request image servers that use port 443. This allows users with stricter firewall restrictions to access MangaDex images"
    private const val standardHttpsPortPref = "usePort443"

    fun getStandardHttpsPreferenceKey(dexLang: String): String {
        return "${standardHttpsPortPref}_$dexLang"
    }

    const val showByDefaultPrefTitle = "Show only by default"

    const val contentRatingSafePrefSummary = "Content Rating: Safe"
    private const val contentRatingSafePref = "contentRatingSafe"

    fun getContentRatingSafePrefKey(dexLang: String): String {
        return "${contentRatingSafePref}_$dexLang"
    }

    const val contentRatingSuggestivePrefSummary = "Content Rating: Suggestive"
    private const val contentRatingSuggestivePref = "contentRatingSuggestive"

    fun getContentRatingSuggestivePrefKey(dexLang: String): String {
        return "${contentRatingSuggestivePref}_$dexLang"
    }

    const val contentRatingEroticaPrefSummary = "Content Rating: Erotica"
    private const val contentRatingEroticaPref = "contentRatingErotica"

    fun getContentRatingEroticaPrefKey(dexLang: String): String {
        return "${contentRatingEroticaPref}_$dexLang"
    }

    const val contentRatingPornographicPrefSummary = "Content Rating: Pornographic"
    private const val contentRatingPornographicPref = "contentRatingPornographic"

    fun getContentRatingPornographicPrefKey(dexLang: String): String {
        return "${contentRatingPornographicPref}_$dexLang"
    }
}
