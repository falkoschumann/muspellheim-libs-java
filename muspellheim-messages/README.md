# Muspellheim Messages

Defines a structure of messages and message handling like CQS: commands and
queries plus notifications.

- Messages
    - Incoming messages
        - Command
        - Query
        - Notification
    - Outcoming messages
        - Command status
        - Query result
        - Notification
- Message handling
    - Request handling
        - Command -> command status plus optional notifications
        - Query -> query result
    - Notification -> commands
