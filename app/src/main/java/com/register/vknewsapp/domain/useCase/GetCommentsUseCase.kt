package com.register.vknewsapp.domain.useCase

import com.register.vknewsapp.domain.entity.FeedPost
import com.register.vknewsapp.domain.entity.PostComment
import com.register.vknewsapp.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class GetCommentsUseCase @Inject constructor(
    private val repository: NewsFeedRepository
) {

    operator fun invoke(feedPost: FeedPost): StateFlow<List<PostComment>> {
        return repository.getComments(feedPost)
    }
}