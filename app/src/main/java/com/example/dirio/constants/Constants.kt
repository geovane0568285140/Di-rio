package com.example.dirio.constants

class Constants private constructor() {

    object DateOrDateTime {
        const val date: String = "dd-MM-yyyy"
        const val dateTime: String = "dd-MM-yyyy HH:mm"
    }

    object DataBase {
        const val namedb_daily = "dailydb"

        object Table {
            const val nameTable_Daily = "Daily"

            object ColumnName_Daily {
                const val title = "Title"
                const val text = "text"
                const val dateTime = "dateTime"
            }
        }
    }

}