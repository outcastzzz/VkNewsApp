package com.register.vknewsapp.presentation.comments

import com.register.vknewsapp.domain.entity.FeedPost
import com.register.vknewsapp.domain.entity.PostComment

sealed class CommentsScreenState {

    data object Initial : CommentsScreenState()

    data class Comments(
        val feedPost: FeedPost,
        val comments: List<PostComment>
    ) : CommentsScreenState()
}