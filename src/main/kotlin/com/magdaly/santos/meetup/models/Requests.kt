package com.magdaly.santos.meetup.models

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

class MeetupRequest(
    @NotBlank
    @NotEmpty
    @Size(min = 0, max = 200)
    val reason: String,

    @NotBlank
    @NotEmpty
    @Size(min = 0, max = 300)
    val description: String ,

)