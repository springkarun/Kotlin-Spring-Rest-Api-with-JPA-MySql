package com.proms.kotlinapi.repository

import com.proms.kotlinapi.model.Article
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository



@Repository
interface ArticleRepository : JpaRepository<Article, Long>