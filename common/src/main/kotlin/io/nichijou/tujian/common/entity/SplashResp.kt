package io.nichijou.tujian.common.entity

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SplashResp(@Json(name = "splash_image") var url: String)
