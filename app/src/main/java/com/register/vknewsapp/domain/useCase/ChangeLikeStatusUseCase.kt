package com.register.vknewsapp.domain.useCase

import com.register.vknewsapp.domain.entity.FeedPost
import com.register.vknewsapp.domain.repository.NewsFeedRepository
import javax.inject.Inject

class ChangeLikeStatusUseCase @Inject constructor(
    private val repository: NewsFeedRepository
) {

    suspend operator fun invoke(feedPost: FeedPost) {
        repository.changeLikeStatus(feedPost)
    }
}