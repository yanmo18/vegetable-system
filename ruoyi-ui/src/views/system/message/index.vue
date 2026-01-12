<template>
  <div class="app-container">
    <el-card>
      <el-table :data="messageList" stripe>
        <el-table-column label="ID" prop="messageId"></el-table-column>
        <el-table-column label="访客姓名" prop="visitorName"></el-table-column>
        <el-table-column label="留言内容" prop="content"></el-table-column>
        <el-table-column label="状态" prop="status">
          <template slot-scope="scope">
            <el-tag :type="scope.row.status === '0' ? 'warning' : 'success'">
              {{ scope.row.status === '0' ? '待回复' : '已回复' }}
            </el-tag>
          </template>
        </el-table-column>
      </el-table>
    </el-card>
  </div>
</template>
<script>
import { getMessageList } from '@/api/system/message'
export default {
  data() {
    return {
      messageList: []
    }
  },
  created() {
    this.getList()
  },
  methods: {
    getList() {
      getMessageList().then(response => {
        this.messageList = response
      })
    }
  }
}
</script>
