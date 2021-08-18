package com.example.wonhoi_moive_review_service_app.domain.model

import com.google.firebase.firestore.DocumentId
import com.google.firebase.firestore.ServerTimestamp
import java.util.*

data class Review(
        @DocumentId
        val id: String? = null,

        @ServerTimestamp
        val createdAt: Date? = null,

        val userId: String? = null,
        val movieId: String? = null,
        val content: String? = null,
        val score: Float? = null
)