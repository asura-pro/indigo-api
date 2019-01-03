package asura.core.cs.model

case class QueryOnlineApi(
                           domain: String,
                           tag: String,
                           method: String,
                           urlPath: String,
                           date: String,
                           sortField: String,
                           asc: Boolean,
                         ) extends QueryPage
