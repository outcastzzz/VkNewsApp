package com.register.vknewsapp.presentation.comments

import androidx.lifecycle.ViewModel
import com.register.vknewsapp.domain.entity.FeedPost
import com.register.vknewsapp.domain.useCase.GetCommentsUseCase
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class CommentsViewModel @Inject constructor(
    private val feedPost: FeedPost,
    private val getCommentsUseCase: GetCommentsUseCase
) : ViewModel() {

    val screenState = getCommentsUseCase(feedPost)
        .map {
            CommentsScreenState.Comments(
                feedPost = feedPost,
                comments = it
            )
        }
}