package com.stc.data.mapper

interface IMapper<Source,Target> {
    fun mapToTarget(item:Source?):Target?
    fun mapFromTarget(item: Target?):Source?
}