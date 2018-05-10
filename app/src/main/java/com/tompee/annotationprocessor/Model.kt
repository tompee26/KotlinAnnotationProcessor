package com.tompee.annotationprocessor

import com.tompee.annotations.Encapsulate

@Encapsulate
data class Model(val counter: Int,
                 val post : String)