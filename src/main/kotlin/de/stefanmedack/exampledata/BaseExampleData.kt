package de.stefanmedack.exampledata

import de.stefanmedack.model.Image
import de.stefanmedack.model.PageLinks
import de.stefanmedack.model.User
import de.stefanmedack.model.Video
import java.util.*

object BaseExampleData {

    const val exampleDateJson = """"1988-03-03T20:15:00+0000""""
    val exampleDateInstance = Date(573423300000)

    // ********
    // *** PageLinks
    // ********

    const val linksJson = """
    "links": {
        "last": "last",
        "prev": "prev",
        "next": "next",
        "first": "first"
    }
    """

    val linksInstance = PageLinks(next = "next")

    // ********
    // *** Image
    // ********

    const val imageJson = """
    {
        "url": "url"
    }
    """
    val imageInstance = Image(url = "url")

    // ********
    // *** Author
    // ********

    const val minimalAuthorJson = """
    {
        "username": "Rick",
        "id": "C-137",
        "user_image": null
    }
    """
    val minimalAuthorInstance = User(username = "Rick", id = "C-137")

    const val fullAuthorJson = """
    {
        "username": "Morty",
        "id": "UNKNOWN",
        "user_image": $imageJson
    }
    """
    val fullAuthorInstance = User(username = "Morty", id = "UNKNOWN", userImage = imageInstance)

    // ********
    // *** Video
    // ********

    const val videoJson = """
    {
        "id": "id",
        "video_url": "video_url",
        "preview_image": $imageJson
    }
    """
    val videoInstance = Video(videoUrl = "video_url", previewImage = imageInstance)

}