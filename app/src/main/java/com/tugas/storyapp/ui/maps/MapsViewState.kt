package com.tugas.storyapp.ui.maps

import com.tugas.storyapp.domain.entity.StoryEntity
import com.tugas.storyapp.utils.ResultState

data class MapsViewState(
    val resultStories: ResultState<List<StoryEntity>> = ResultState.Idle(),
)