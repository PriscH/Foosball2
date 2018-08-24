package jp.foosball.repositories

import jp.foosball.models.ExampleModel
import org.springframework.data.repository.CrudRepository

interface ExampleRepository : CrudRepository<ExampleModel, String>